package xyz.zhangyi.diamond.demo.ordercontext.acl.ports.repositories;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@Repository
public interface OrderRepository {
    void add(Order order);
}
