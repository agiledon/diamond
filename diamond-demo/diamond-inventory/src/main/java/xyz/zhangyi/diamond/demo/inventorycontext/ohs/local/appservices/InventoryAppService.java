package xyz.zhangyi.diamond.demo.inventorycontext.ohs.local.appservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.InventoryService;
import xyz.zhangyi.diamond.demo.inventorycontext.ohs.local.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.inventorycontext.ohs.local.pl.InventoryReviewResponse;

@Service
public class InventoryAppService {
    @Autowired
    private InventoryService inventoryService;

    public InventoryReviewResponse checkInventory(CheckingInventoryRequest request) {
        InventoryReview inventoryReview = inventoryService.reviewInventory(request.to());
        return InventoryReviewResponse.from(inventoryReview);
    }
}
