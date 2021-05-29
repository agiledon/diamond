package xyz.zhangyi.diamond.demo.ordercontext.domain.order;

public class OrderId {
    private String value;

    public OrderId(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
