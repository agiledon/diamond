package xyz.zhangyi.diamond.demo.ordercontext.south.message;

import java.io.Serializable;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.ordercontext.domain.InventoryReview;

@MessageContract(Direction.South)
public class InventoryReviewResponse implements Serializable {
    public static InventoryReviewResponse from(InventoryReview inventoryReview) {
        return null;
    }
    
    public InventoryReview to() {
        return null;
    }
}
