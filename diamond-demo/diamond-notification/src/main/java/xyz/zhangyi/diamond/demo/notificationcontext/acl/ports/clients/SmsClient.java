package xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.clients;

public interface SmsClient {
    void send(String phoneNumber, String message);
}
