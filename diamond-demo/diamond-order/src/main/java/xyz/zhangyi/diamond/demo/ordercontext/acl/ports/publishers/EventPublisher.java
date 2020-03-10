package xyz.zhangyi.diamond.demo.ordercontext.acl.ports.publishers;

import xyz.zhangyi.diamond.demo.foundation.models.pl.ApplicationEvent;

public interface EventPublisher {
    void publish(ApplicationEvent applicationEvent);
}
