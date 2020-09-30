package xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl;

import xyz.zhangyi.diamond.demo.foundation.models.pl.ApplicationEvent;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

public class OrderPlaced extends ApplicationEvent {
    public static OrderPlaced from(Order order) {
        return null;
    }
}
