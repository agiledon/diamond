package xyz.zhangyi.diamond.demo.ordercontext.southbound.adapter.repositories;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Adapter;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.southbound.port.repositories.OrderRepository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@Adapter(PortType.Repository)
public class OrderRepositoryAdapter implements OrderRepository {
    @Override
    public void add(Order order) {

    }
}
