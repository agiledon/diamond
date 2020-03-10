package xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl;

import java.io.Serializable;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

public class CheckingInventoryRequest implements Serializable {
    public static CheckingInventoryRequest from(Order order) {
        return null;
    }
}
