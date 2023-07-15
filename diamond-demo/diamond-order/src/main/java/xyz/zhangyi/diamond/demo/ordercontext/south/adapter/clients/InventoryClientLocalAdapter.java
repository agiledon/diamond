package xyz.zhangyi.diamond.demo.ordercontext.south.adapter.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.zhangyi.diamond.demo.inventorycontext.north.local.appservice.InventoryAppService;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.clients.InventoryClient;

@Component
public class InventoryClientLocalAdapter implements InventoryClient {

    @Autowired
    private InventoryAppService appService;

    @Override
    public InventoryReview check(Order order) {
        return null;
    }

    @Override
    public void lock(Order order) {

    }
}
