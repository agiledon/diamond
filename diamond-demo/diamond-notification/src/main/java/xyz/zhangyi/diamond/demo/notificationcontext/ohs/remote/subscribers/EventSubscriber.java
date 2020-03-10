package xyz.zhangyi.diamond.demo.notificationcontext.ohs.remote.subscribers;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.appservices.NotificationAppService;
import xyz.zhangyi.diamond.demo.notificationcontext.ohs.local.pl.OrderPlacedEvent;

public class EventSubscriber {
    @Autowired
    private NotificationAppService notificationAppService;

    @KafkaListener(id = "order-placed", clientIdPrefix = "order", topics = {"topic.e-commerce.order"}, containerFactory = "containerFactory")
    public void subscribeEvent(String eventData) {
        OrderPlacedEvent orderPlacedEvent = JSON.parseObject(eventData, OrderPlacedEvent.class);
        notificationAppService.notifyToCustomer(orderPlacedEvent);
    }
}
