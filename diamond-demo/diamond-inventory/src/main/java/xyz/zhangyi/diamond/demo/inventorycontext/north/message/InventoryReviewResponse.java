package xyz.zhangyi.diamond.demo.inventorycontext.north.message;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.InventoryReview;

@MessageContract(Direction.North)
public class InventoryReviewResponse {
    public static InventoryReviewResponse from(InventoryReview inventoryReview) {
        return null;
    }

    public InventoryReview to() {
        return null;
    }
}
