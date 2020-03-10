package xyz.zhangyi.diamond.demo.ordercontext.ohs.local.appservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.zhangyi.diamond.demo.foundation.exceptions.ApplicationException;
import xyz.zhangyi.diamond.demo.foundation.exceptions.DomainException;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.publishers.EventPublisher;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;
import xyz.zhangyi.diamond.demo.ordercontext.domain.OrderService;
import xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl.OrderPlacedEvent;
import xyz.zhangyi.diamond.demo.ordercontext.ohs.local.pl.PlacingOrderRequest;

@Service
public class OrderAppService {
    @Autowired
    private OrderService orderService;
    @Autowired
    private EventPublisher eventPublisher;

    private static final Logger logger = LoggerFactory.getLogger(OrderAppService.class);

    @Transactional(rollbackFor = ApplicationException.class)
    public void placeOrder(PlacingOrderRequest request) {
        try {
            Order order = request.to();
            orderService.placeOrder(order);

            OrderPlacedEvent orderPlaced = OrderPlacedEvent.from(order);
            eventPublisher.publish(orderPlaced);
        } catch (DomainException ex) {
            logger.warn(ex.getMessage());
            throw new ApplicationException(ex.getMessage(), ex);
        }
    }
}
