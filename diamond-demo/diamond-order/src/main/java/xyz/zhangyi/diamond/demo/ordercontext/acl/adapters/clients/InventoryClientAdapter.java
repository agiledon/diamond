package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.pl.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.pl.LockingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.ordercontext.domain.Order;

@Component
public class InventoryClientAdapter implements InventoryClient {
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
