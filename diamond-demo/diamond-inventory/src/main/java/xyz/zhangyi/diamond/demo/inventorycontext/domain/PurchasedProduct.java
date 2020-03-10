package xyz.zhangyi.diamond.demo.inventorycontext.domain;

public class PurchasedProduct {
    private String productId;
    private int purchasedQuantity;
    private int inventoryQuantity;

    public PurchasedProduct(String productId, int purchasedQuantity, int inventoryQuantity) {
        this.productId = productId;
        this.purchasedQuantity = purchasedQuantity;
        this.inventoryQuantity = inventoryQuantity;
    }

    public String productId() {
        return this.productId;
    }

    public int purchasedQuantity() {
        return this.purchasedQuantity;
    }

    public int inventoryQuantity() {
        return this.inventoryQuantity;
    }
}
