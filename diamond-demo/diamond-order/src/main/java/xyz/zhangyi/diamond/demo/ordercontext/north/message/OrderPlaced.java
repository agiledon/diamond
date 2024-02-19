package xyz.zhangyi.diamond.demo.ordercontext.north.message;

import xyz.zhangyi.diamond.demo.foundation.model.message.ApplicationEvent;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;

@MessageContract(Direction.North)
public class OrderPlaced extends ApplicationEvent {
    public static OrderPlaced from(Order order) {
        return new OrderPlaced();
    }
}
