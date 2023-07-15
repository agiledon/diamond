package xyz.zhangyi.diamond.demo.notificationcontext.north.local.appservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.NotificationService;
import xyz.zhangyi.diamond.demo.notificationcontext.north.local.handler.OrderCancelledEventHandler;
import xyz.zhangyi.diamond.demo.notificationcontext.north.local.handler.OrderPlacedEventHandler;
import xyz.zhangyi.diamond.demo.notificationcontext.north.message.OrderCancelled;
import xyz.zhangyi.diamond.demo.notificationcontext.north.message.OrderPlaced;

@Service
public class NotificationAppService implements OrderPlacedEventHandler, OrderCancelledEventHandler {
    @Autowired
    private NotificationService notificationService;

    @Override
    public void handle(OrderPlaced event) {
        notificationService.notify(event.to());
    }

    @Override
    public void handle(OrderCancelled event) {

    }
}
