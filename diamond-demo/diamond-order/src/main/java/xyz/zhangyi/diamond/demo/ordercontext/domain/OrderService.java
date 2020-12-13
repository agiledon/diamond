package xyz.zhangyi.diamond.demo.ordercontext.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.foundation.stereotype.DomainService;
import xyz.zhangyi.diamond.demo.ordercontext.southbound.ports.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.southbound.ports.repositories.OrderRepository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exceptions.InvalidOrderException;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exceptions.NotEnoughInventoryException;

@Service
@DomainService
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private InventoryClient inventoryClient;

    public void placeOrder(Order order) {
        if (!order.isInvalid()) {
            throw new InvalidOrderException();
        }

        InventoryReview inventoryReview = inventoryClient.check(order);
        if (!inventoryReview.isAvailable()) {
            throw new NotEnoughInventoryException();
        }

        orderRepository.add(order);
        inventoryClient.lock(order);
    }
}
