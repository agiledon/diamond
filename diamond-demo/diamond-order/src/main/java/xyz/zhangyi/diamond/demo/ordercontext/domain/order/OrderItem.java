package xyz.zhangyi.diamond.demo.ordercontext.domain.order;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private String id;
    private List<Product> purchased;

    public OrderItem() {
        purchased = new ArrayList<>();
    }

    public String id() {
        return id;
    }
}
