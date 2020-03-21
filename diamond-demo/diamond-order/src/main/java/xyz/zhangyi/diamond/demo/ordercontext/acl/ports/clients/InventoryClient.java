package xyz.zhangyi.diamond.demo.ordercontext.acl.ports.clients;

import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

public interface InventoryClient {
    InventoryReview check(Order order);
    void lock(Order order);
}
