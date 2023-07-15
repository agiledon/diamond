package xyz.zhangyi.diamond.demo.notificationcontext.north.message;


import xyz.zhangyi.diamond.demo.foundation.model.pl.ApplicationEvent;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.Notification;

public class OrderPlaced extends ApplicationEvent {
    private String ownerId;

    public Notification to() {
        return null;
    }
}
