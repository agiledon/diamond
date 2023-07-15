package xyz.zhangyi.diamond.demo.notificationcontext.south.port.client;

public interface SmsClient {
    void send(String phoneNumber, String message);
}
