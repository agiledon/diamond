package xyz.zhangyi.diamond.demo.notificationcontext.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.foundation.stereotype.DomainService;
import xyz.zhangyi.diamond.demo.notificationcontext.south.port.client.CustomerClient;
import xyz.zhangyi.diamond.demo.notificationcontext.south.port.client.SmsClient;

@Service
@DomainService
public class NotificationService {
    @Autowired
    private CustomerClient customerClient;
    @Autowired
    private SmsClient smsClient;

    public void notify(Notification notification) {
        Customer customer = customerClient.customerOf(notification.to().id());
        notification.filledWith(customer);

        smsClient.send(notification.to().phoneNumber(), notification.content());
    }
}
