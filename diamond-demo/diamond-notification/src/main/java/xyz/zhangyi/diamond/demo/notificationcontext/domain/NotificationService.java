package xyz.zhangyi.diamond.demo.notificationcontext.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.clients.CustomerClient;
import xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.clients.SmsClient;
import xyz.zhangyi.diamond.demo.notificationcontext.acl.ports.pl.CustomerResponse;

@Service
public class NotificationService {
    @Autowired
    private CustomerClient customerClient;
    @Autowired
    private SmsClient smsClient;

    public void notify(Notification notification) {
        CustomerResponse customerResponse = customerClient.customerOf(notification.to().id());
        notification.filledWith(customerResponse.to());

        smsClient.send(notification.to().phoneNumber(), notification.content());
    }
}
