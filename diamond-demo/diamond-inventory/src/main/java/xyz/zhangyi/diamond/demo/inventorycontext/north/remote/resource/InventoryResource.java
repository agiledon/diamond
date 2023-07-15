package xyz.zhangyi.diamond.demo.inventorycontext.north.remote.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangyi.diamond.demo.inventorycontext.north.local.appservice.InventoryAppService;
import xyz.zhangyi.diamond.demo.inventorycontext.north.message.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.inventorycontext.north.message.InventoryReviewResponse;

@RestController
@RequestMapping(value="/inventories")
public class InventoryResource {
    @Autowired
    private InventoryAppService inventoryAppService;

    @PostMapping
    public ResponseEntity<InventoryReviewResponse> check(CheckingInventoryRequest request) {
        InventoryReviewResponse reviewResponse = inventoryAppService.checkInventory(request);
        return new ResponseEntity<>(reviewResponse, HttpStatus.OK);
    }
}
