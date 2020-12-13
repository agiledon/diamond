package xyz.zhangyi.diamond.demo.ordercontext.northbound.local.appservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xyz.zhangyi.diamond.demo.foundation.exceptions.ApplicationException;
import xyz.zhangyi.diamond.demo.foundation.exceptions.DomainException;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Local;
import xyz.zhangyi.diamond.demo.ordercontext.southbound.ports.publishers.EventPublisher;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;
import xyz.zhangyi.diamond.demo.ordercontext.domain.OrderService;
import xyz.zhangyi.diamond.demo.ordercontext.northbound.local.pl.OrderPlaced;
import xyz.zhangyi.diamond.demo.ordercontext.northbound.local.pl.PlacingOrderRequest;

@Service
@Local
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

            OrderPlaced orderPlaced = OrderPlaced.from(order);
            eventPublisher.publish(orderPlaced);
        } catch (DomainException ex) {
            logger.warn(ex.getMessage());
            throw new ApplicationException(ex.getMessage(), ex);
        }
    }
}
