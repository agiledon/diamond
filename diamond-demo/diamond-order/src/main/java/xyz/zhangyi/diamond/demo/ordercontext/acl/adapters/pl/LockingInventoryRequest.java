package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.pl;

import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

import java.io.Serializable;

public class LockingInventoryRequest implements Serializable {
    public static LockingInventoryRequest from(Order order) {
        return null;
    }
}
