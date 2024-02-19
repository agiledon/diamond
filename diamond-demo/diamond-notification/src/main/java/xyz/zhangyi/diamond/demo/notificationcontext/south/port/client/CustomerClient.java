package xyz.zhangyi.diamond.demo.notificationcontext.south.port.client;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.Customer;

@Port(PortType.Client)
public interface CustomerClient {
    Customer customerOf(String customerId);
}
