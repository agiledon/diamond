package xyz.zhangyi.diamond.demo.ordercontext.acl.ports.clients;

import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.LockingInventoryRequest;

public interface InventoryClient {
    InventoryReviewResponse check(CheckingInventoryRequest request);
    void lock(LockingInventoryRequest from);
}
