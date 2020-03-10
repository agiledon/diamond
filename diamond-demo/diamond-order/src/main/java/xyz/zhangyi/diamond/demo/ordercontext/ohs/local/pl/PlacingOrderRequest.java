package xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl;

import java.io.Serializable;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

public class PlacingOrderRequest implements Serializable {
    public Order to() {
        return new Order();
    }
}
