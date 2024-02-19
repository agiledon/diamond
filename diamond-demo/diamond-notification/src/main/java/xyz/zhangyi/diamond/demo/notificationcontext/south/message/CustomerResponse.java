package xyz.zhangyi.diamond.demo.notificationcontext.south.message;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;
import xyz.zhangyi.diamond.demo.notificationcontext.domain.Customer;

@MessageContract(Direction.South)
public class CustomerResponse {
    public Customer to() {
        return null;
    }
}
