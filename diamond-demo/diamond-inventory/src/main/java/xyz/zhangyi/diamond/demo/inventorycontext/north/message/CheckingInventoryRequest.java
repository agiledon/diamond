package xyz.zhangyi.diamond.demo.inventorycontext.north.message;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.PurchasedProduct;

import java.util.List;

@MessageContract(Direction.North)
public class CheckingInventoryRequest {
    public List<PurchasedProduct> to() {
        return null;
    }
}
