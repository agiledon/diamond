package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.repositories;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Adapter;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.repositories.OrderRepository;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@Adapter(PortType.Repository)
public class OrderRepositoryAdapter implements OrderRepository {
    @Override
    public void add(Order order) {

    }
}
