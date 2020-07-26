package xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.clients;

import xyz.zhangyi.diamond.demo.notificationcontext.domain.Customer;

public interface CustomerClient {
    Customer customerOf(String customerId);
}
