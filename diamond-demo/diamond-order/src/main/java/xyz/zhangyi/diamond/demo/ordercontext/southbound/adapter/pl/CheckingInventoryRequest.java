package xyz.zhangyi.diamond.demo.ordercontext.southbound.adapter.pl;

import java.io.Serializable;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;

@MessageContract(Direction.South)
public class CheckingInventoryRequest implements Serializable {
    public static CheckingInventoryRequest from(Order order) {
        return null;
    }
}
