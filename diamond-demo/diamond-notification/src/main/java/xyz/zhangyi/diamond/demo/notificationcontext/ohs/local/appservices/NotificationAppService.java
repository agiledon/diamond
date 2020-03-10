package xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.appservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.NotificationService;
import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.pl.OrderPlacedEvent;

@Service
public class NotificationAppService {
    @Autowired
    private NotificationService notificationService;

    public void notifyToCustomer(OrderPlacedEvent orderPlacedEvent) {
        notificationService.notify(orderPlacedEvent.to());
    }
}
