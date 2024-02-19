package xyz.zhangyi.diamond.demo.ordercontext.domain.shoppingcart;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Aggregate;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Product;

import java.util.List;

@Aggregate
public class ShoppingCart {
    public void removeItems(List<Product> purchasedProducts) {

    }
}
