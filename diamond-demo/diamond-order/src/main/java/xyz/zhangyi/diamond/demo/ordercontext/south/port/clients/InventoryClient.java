package xyz.zhangyi.diamond.demo.ordercontext.south.port.clients;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;

@Port(PortType.Client)
public interface InventoryClient {
    InventoryReview check(Order order);
    void lock(Order order);
}
