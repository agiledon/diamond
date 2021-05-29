package xyz.zhangyi.diamond.demo.ordercontext.domain.order;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Aggregate;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exception.OrderException;

@Aggregate
public class Order {
    private OrderId id;
    private OrderStatus status;

    public void validate() {
        throw new OrderException(String.format("the order with id %s is invalid", id.value()));
    }

    public void cancel() {
        this.status = OrderStatus.Canceled;
    }
}
