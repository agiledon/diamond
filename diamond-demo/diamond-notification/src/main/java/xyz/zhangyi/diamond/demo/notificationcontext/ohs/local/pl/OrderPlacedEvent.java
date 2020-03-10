package xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.pl;


import xyz.zhangyi.diamond.demo.foundation.models.pl.ApplicationEvent;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.Notification;

public class OrderPlacedEvent extends ApplicationEvent {
    public Notification to() {
        return null;
    }
}
