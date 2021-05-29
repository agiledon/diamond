package xyz.zhangyi.diamond.demo.ordercontext.southbound.port.repositories;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.OrderId;

import java.util.Optional;

@Repository
@Port(PortType.Repository)
public interface OrderRepository {
    Optional<Order> orderOf(OrderId orderId);
    void add(Order order);
    void save(Order order);
}
