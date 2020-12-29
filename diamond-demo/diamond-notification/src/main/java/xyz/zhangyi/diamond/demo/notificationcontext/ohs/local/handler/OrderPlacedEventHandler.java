package xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.handler;

import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.pl.OrderPlaced;

public interface OrderPlacedEventHandler {
    void handle(OrderPlaced event);
}
