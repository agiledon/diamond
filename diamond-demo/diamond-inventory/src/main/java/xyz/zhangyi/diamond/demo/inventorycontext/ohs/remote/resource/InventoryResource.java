package xyz.zhangyi.diamond.demo.inventorycontext.ohs.remote.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangyi.diamond.demo.inventorycontext.ohs.local.appservice.InventoryAppService;
import xyz.zhangyi.diamond.demo.inventorycontext.ohs.local.pl.CheckingInventoryRequest;
import xyz.zhangyi.diamond.demo.inventorycontext.ohs.local.pl.InventoryReviewResponse;

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
