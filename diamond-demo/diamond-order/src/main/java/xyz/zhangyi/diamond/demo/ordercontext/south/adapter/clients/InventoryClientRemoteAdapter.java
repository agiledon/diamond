package xyz.zhangyi.diamond.demo.ordercontext.south.adapter.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Adapter;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.south.message.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.south.message.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.south.message.LockingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Order;

@Component
@Adapter(PortType.Client)
public class InventoryClientRemoteAdapter implements InventoryClient {
    private static final String INVENTORIES_RESOURCE_URL = "http://inventory-service/inventories";
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public InventoryReview check(Order order) {
        CheckingInventoryRequest inventoryRequest = CheckingInventoryRequest.from(order);
        InventoryReviewResponse reviewResponse = restTemplate.postForObject(INVENTORIES_RESOURCE_URL, inventoryRequest, InventoryReviewResponse.class);
        return reviewResponse.to();
    }

    @Override
    public void lock(Order order) {
        LockingInventoryRequest inventoryRequest = LockingInventoryRequest.from(order);
        restTemplate.put(INVENTORIES_RESOURCE_URL, inventoryRequest);
    }
}
