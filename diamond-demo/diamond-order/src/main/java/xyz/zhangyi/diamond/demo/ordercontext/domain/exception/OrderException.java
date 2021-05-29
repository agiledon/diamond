package xyz.zhangyi.diamond.demo.ordercontext.domain.exception;

import xyz.zhangyi.diamond.demo.foundation.exception.DomainException;

public class OrderException extends DomainException {
    public OrderException() {
        super("Order Exception");
    }

    public OrderException(String message) {
        super(message);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }
}
