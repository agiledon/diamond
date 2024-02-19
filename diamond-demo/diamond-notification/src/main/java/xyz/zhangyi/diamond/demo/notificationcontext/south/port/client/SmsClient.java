package xyz.zhangyi.diamond.demo.notificationcontext.south.port.client;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;

@Port(PortType.Client)
public interface SmsClient {
    void send(String phoneNumber, String message);
}
