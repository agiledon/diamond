package xyz.zhangyi.diamond.demo.notificationcontext.north.message;


import xyz.zhangyi.diamond.demo.foundation.model.message.ApplicationEvent;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.Notification;

@MessageContract(Direction.North)
public class OrderPlaced extends ApplicationEvent {
    private String ownerId;

    public Notification to() {
        return null;
    }
}
