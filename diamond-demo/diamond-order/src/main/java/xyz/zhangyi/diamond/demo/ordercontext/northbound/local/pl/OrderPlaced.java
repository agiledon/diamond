package xyz.zhangyi.diamond.demo.ordercontext.northbound.local.pl;

import xyz.zhangyi.diamond.demo.foundation.model.pl.ApplicationEvent;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@MessageContract(Direction.North)
public class OrderPlaced extends ApplicationEvent {
    public static OrderPlaced from(Order order) {
        return null;
    }
}
