package xyz.zhangyi.diamond.demo.customercontext.north.message;

import xyz.zhangyi.diamond.demo.customercontext.domain.Customer;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Direction;
import xyz.zhangyi.diamond.demo.foundation.stereotype.MessageContract;

@MessageContract(Direction.North)
public class CustomerResponse {
    public static CustomerResponse from(Customer customer) {
        return null;
    }
}
