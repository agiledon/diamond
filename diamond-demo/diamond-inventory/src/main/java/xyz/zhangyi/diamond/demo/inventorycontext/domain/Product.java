package xyz.zhangyi.diamond.demo.inventorycontext.domain;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Aggregate;

import java.util.List;

@Aggregate
public class Product {
    private String productId;

    public Product(String productId) {
        this.productId = productId;
    }

    public String productId() {
        return this.productId;
    }

    public Availability checkAvailability(List<PurchasedProduct> purchasedProducts) {
        return null;
    }
}
