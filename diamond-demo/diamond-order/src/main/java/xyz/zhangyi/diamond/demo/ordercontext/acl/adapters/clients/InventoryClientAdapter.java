package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.clients;

import org.springframework.stereotype.Component;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.LockingInventoryRequest;

@Component
public class InventoryClientAdapter implements InventoryClient {
    @Override
    public InventoryReviewResponse check(CheckingInventoryRequest request) {
        return null;
    }

    @Override
    public void lock(LockingInventoryRequest from) {

    }
}
