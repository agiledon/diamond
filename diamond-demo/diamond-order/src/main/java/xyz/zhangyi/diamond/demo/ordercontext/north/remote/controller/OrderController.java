package xyz.zhangyi.diamond.demo.ordercontext.north.remote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Remote;
import xyz.zhangyi.diamond.demo.foundation.stereotype.RemoteType;
import xyz.zhangyi.diamond.demo.ordercontext.north.local.appservices.OrderAppService;
import xyz.zhangyi.diamond.demo.ordercontext.north.message.PlacingOrderRequest;

@RestController
@RequestMapping(value="/orders")
@Remote(RemoteType.Controller)
public class OrderController
{
    @Autowired
    private OrderAppService orderAppService;

    @PostMapping
    public void placeOrder(PlacingOrderRequest request) {
        // validate request ?
        orderAppService.placeOrder(request);
    }
}
