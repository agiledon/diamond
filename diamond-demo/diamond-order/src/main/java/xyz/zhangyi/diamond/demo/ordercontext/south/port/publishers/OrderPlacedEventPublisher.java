package xyz.zhangyi.diamond.demo.ordercontext.south.port.publishers;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.north.message.OrderPlaced;

@Port(PortType.Publisher)
public interface OrderPlacedEventPublisher {
    void publish(OrderPlaced orderPlaced);
}
