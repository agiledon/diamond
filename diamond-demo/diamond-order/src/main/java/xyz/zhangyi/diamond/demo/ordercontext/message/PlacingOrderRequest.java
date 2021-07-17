package xyz.zhangyi.diamond.demo.ordercontext.message;

import java.io.Serializable;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;

@MessageContract(Direction.North)
public class PlacingOrderRequest implements Serializable {
    public Order to() {
        return new Order();
    }
}
