package xyz.zhangyi.diamond.demo.ordercontext.south.adapter.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Adapter;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.inventorycontext.north.local.appservice.InventoryAppService;
import xyz.zhangyi.diamond.demo.inventorycontext.north.message.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.inventorycontext.north.message.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.clients.InventoryClient;

@Component
@Adapter(PortType.Client)
public class InventoryClientLocalAdapter implements InventoryClient {

    @Autowired
    private InventoryAppService appService;

    @Override
    public InventoryReview check(Order order) {
        CheckingInventoryRequest checkingInventoryRequest = new CheckingInventoryRequest();
        InventoryReviewResponse inventoryReviewResponse = appService.checkInventory(checkingInventoryRequest);

        return null;
    }

    @Override
    public void lock(Order order) {

    }
}
