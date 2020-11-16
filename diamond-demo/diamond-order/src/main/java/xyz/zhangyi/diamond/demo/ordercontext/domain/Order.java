package xyz.zhangyi.diamond.demo.ordercontext.domain;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Aggregate;

@Aggregate
public class Order {
    public boolean isInvalid() {
        return false;
    }
}
