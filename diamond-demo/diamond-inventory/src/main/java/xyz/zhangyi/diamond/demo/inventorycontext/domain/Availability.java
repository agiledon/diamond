package xyz.zhangyi.diamond.demo.inventorycontext.domain;

public class Availability {
    private String productId;
    private boolean isAvailable;

    public Availability(String productId, boolean isAvailable) {
        this.productId = productId;
        this.isAvailable = isAvailable;
    }
}
