package xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.clients;

import xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.pl.CustomerResponse;

public interface CustomerClient {
    CustomerResponse customerOf(String customerId);
}
