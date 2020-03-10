package xyz.zhangyi.diamond.demo.ordercontext.acl.adapters.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.clients.InventoryClient;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.InventoryReviewResponse;
import xyz.zhangyi.diamond.demo.ordercontext.acl.ports.pl.LockingInventoryRequest;

@Component
public class InventoryClientAdapter implements InventoryClient {
    private static final String INVENTORIES_RESOURCE_URL = "http://inventory-service/inventories";

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public InventoryReviewResponse check(CheckingInventoryRequest request) {
        return restTemplate.postForObject(INVENTORIES_RESOURCE_URL, request, InventoryReviewResponse.class);
    }

    @Override
    public void lock(LockingInventoryRequest request) {
        restTemplate.put(INVENTORIES_RESOURCE_URL, request);
    }
}
