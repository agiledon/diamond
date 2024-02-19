package xyz.zhangyi.diamond.demo.notificationcontext.north.message;

import xyz.zhangyi.diamond.demo.foundation.model.message.ApplicationEvent;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;

@MessageContract(Direction.North)
public class OrderCancelled extends ApplicationEvent {
}
