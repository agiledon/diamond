package xyz.zhangyi.diamond.demo.notificationcontext.acl.port.client;

public interface SmsClient {
    void send(String phoneNumber, String message);
}
