package xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl;

import java.io.Serializable;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@MessageContract(Direction.North)
public class PlacingOrderRequest implements Serializable {
    public Order to() {
        return new Order();
    }
}
