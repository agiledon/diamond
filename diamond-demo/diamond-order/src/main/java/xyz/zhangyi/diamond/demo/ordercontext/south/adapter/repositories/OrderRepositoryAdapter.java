package xyz.zhangyi.diamond.demo.ordercontext.south.adapter.repositories;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Adapter;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.repositories.OrderRepository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;

@Adapter(PortType.Repository)
public class OrderRepositoryAdapter implements OrderRepository {
    @Override
    public void add(Order order) {

    }
}
