package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.pl;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

import java.io.Serializable;

@MessageContract(Direction.South)
public class LockingInventoryRequest implements Serializable {
    public static LockingInventoryRequest from(Order order) {
        return null;
    }
}
