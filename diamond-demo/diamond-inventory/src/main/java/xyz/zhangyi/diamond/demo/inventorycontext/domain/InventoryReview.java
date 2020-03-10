package xyz.zhangyi.diamond.demo.inventorycontext.domain;

import java.util.ArrayList;
import java.util.List;

public class InventoryReview {
    private List<Availability> availabilities;

    public InventoryReview(List<Availability> availabilities) {
        if (availabilities == null) {
            availabilities = new ArrayList<>();
        }
        this.availabilities = availabilities;
    }
}
