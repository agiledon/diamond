package xyz.zhangyi.diamond.demo.notificationcontext.north.local.handler;

import xyz.zhangyi.diamond.demo.notificationcontext.north.message.OrderCancelled;

public interface OrderCancelledEventHandler {
    void handle(OrderCancelled event);
}
