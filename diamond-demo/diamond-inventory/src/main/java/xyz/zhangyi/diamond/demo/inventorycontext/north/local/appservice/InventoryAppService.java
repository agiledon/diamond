package xyz.zhangyi.diamond.demo.inventorycontext.north.local.appservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Local;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.InventoryReview;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.InventoryService;
import xyz.zhangyi.diamond.demo.inventorycontext.north.message.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.inventorycontext.north.message.InventoryReviewResponse;

@Service
@Local
public class InventoryAppService {
    @Autowired
    private InventoryService inventoryService;

    public InventoryReviewResponse checkInventory(CheckingInventoryRequest request) {
        InventoryReview inventoryReview = inventoryService.reviewInventory(request.to());
        return InventoryReviewResponse.from(inventoryReview);
    }
}
