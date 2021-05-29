package xyz.zhangyi.diamond.demo.ordercontext.domain.order;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Aggregate;
import xyz.zhangyi.diamond.demo.ordercontext.domain.exception.OrderException;

import java.util.ArrayList;
import java.util.List;

@Aggregate
public class Order {
    private OrderId id;
    private OrderStatus status;
    private List<OrderItem> orderItems;

    public Order() {
        orderItems = new ArrayList<>();
    }

    public void validate() {
        throw new OrderException(String.format("the order with id %s is invalid", id.value()));
    }

    public void cancel() {
        this.status = OrderStatus.Cancelled;
    }

    public void removeItem(String orderItemId) {
        if (orderItems.size() == 0) {
            return;
        }
        if (orderItems.size() == 1 && orderItems.get(0).id() == orderItemId) {
            throw new OrderException("Can not remove last item.");
        }

        while (orderItems.iterator().hasNext()) {
            OrderItem nextItem = orderItems.iterator().next();
            if (nextItem.id() == orderItemId) {
                orderItems.remove(nextItem);
            }
        }
    }
}
