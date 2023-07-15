package xyz.zhangyi.diamond.demo.notificationcontext.north.remote.subscriber;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import xyz.zhangyi.diamond.demo.notificationcontext.north.local.handler.OrderPlacedEventHandler;
import xyz.zhangyi.diamond.demo.notificationcontext.north.message.OrderPlaced;

public class OrderPlacedEventSubscriber {
    @Autowired
    private OrderPlacedEventHandler eventHandler;

    @KafkaListener(id = "order-placed", clientIdPrefix = "order", topics = {"topic.e-commerce.order"}, containerFactory = "containerFactory")
    public void subscribeEvent(String eventData) {
        OrderPlaced orderPlaced = JSON.parseObject(eventData, OrderPlaced.class);
        eventHandler.handle(orderPlaced);
    }
}
