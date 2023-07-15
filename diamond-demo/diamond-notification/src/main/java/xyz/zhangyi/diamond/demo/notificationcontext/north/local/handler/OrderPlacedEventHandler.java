package xyz.zhangyi.diamond.demo.notificationcontext.north.local.handler;

import xyz.zhangyi.diamond.demo.notificationcontext.north.message.OrderPlaced;

public interface OrderPlacedEventHandler {
    void handle(OrderPlaced event);
}
