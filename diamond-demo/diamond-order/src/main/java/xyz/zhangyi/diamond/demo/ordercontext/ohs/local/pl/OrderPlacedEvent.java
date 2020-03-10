package xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl;

import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

public class OrderPlacedEvent extends ApplicationEvent {
    public static OrderPlacedEvent from(Order order) {
        return null;
    }
}
