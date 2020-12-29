package xyz.zhangyi.diamond.demo.ordercontext.southbound.port.publishers;

import xyz.zhangyi.diamond.demo.foundation.model.pl.ApplicationEvent;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;

@Port(PortType.Publisher)
public interface EventPublisher {
    void publish(ApplicationEvent applicationEvent);
}
