package xyz.zhangyi.diamond.demo.ordercontext.domain.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.foundation.stereotype.DomainService;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.shoppingcart.ShoppingCartService;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.repositories.OrderRepository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exception.OrderException;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exception.NotEnoughInventoryException;

import java.util.Optional;

@Service
@DomainService
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private InventoryClient inventoryClient;
    @Autowired
    private ShoppingCartService shoppingCartService;

    public void placeOrder(Order order) {
        order.validate();

        InventoryReview inventoryReview = inventoryClient.check(order);
        if (!inventoryReview.isAvailable()) {
            throw new NotEnoughInventoryException();
        }

        orderRepository.add(order);
        shoppingCartService.removeItems(order.customerId(), order.purchasedProducts());
        inventoryClient.lock(order);
    }

    public void cancelOrder(OrderId orderId) {
        Order order = loadOrder(orderId);
        order.cancel();
        orderRepository.save(order);
    }

    public void removeItems(OrderId orderId, String orderItemId) {
        Order order = loadOrder(orderId);
        order.removeItem(orderItemId);
        orderRepository.save(order);
    }

    private Order loadOrder(OrderId orderId) {
        Optional<Order> optOrder = orderRepository.orderOf(orderId);
        if (!optOrder.isPresent()) {
            throw new OrderException("order is not found");
        }
        return optOrder.get();
    }
}
