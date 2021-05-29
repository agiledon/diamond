package xyz.zhangyi.diamond.demo.ordercontext.domain.order;

public class OrderItem {
    private String id;
    private Product purchasedProduct;

    public OrderItem(String id, Product purchasedProduct) {
        this.id = id;
        this.purchasedProduct = purchasedProduct;
    }

    public String id() {
        return id;
    }

    public Product purchased() {
        return purchasedProduct;
    }
}
