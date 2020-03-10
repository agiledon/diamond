package xyz.zhangyi.diamond.demo.ordercontext.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.LockingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.repositories.OrderRepository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exceptions.InvalidOrderException;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exceptions.NotEnoughInventoryException;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private InventoryClient inventoryClient;

    public void placeOrder(Order order) {
        if (order.isValid()) {
            throw new InvalidOrderException();
        }

        CheckingInventoryRequest inventoryRequest = CheckingInventoryRequest.from(order);
        InventoryReviewResponse reviewResponse = inventoryClient.check(inventoryRequest);
        InventoryReview inventoryReview = reviewResponse.to();

        if (!inventoryReview.isAvailable()) {
            throw new NotEnoughInventoryException();
        }

        orderRepository.add(order);

        inventoryClient.lock(LockingInventoryRequest.from(order));
    }
}
