package xyz.zhangyi.diamond.demo.notificationcontext.south.port.client;

import xyz.zhangyi.diamond.demo.notificationcontext.domain.Customer;

public interface CustomerClient {
    Customer customerOf(String customerId);
}
