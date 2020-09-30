package xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.handlers;

import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.pl.OrderPlaced;

public interface OrderPlacedEventHandler {
    void handle(OrderPlaced event);
}
