package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.pl;

import java.io.Serializable;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

public class CheckingInventoryRequest implements Serializable {
    public static CheckingInventoryRequest from(Order order) {
        return null;
    }
}
