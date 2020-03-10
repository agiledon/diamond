package xyz.zhangyi.diamond.demo.ordercontext.ohs.local.appservices.exceptions;

import xyz.zhangyi.diamond.demo.ordercontext.domain.exceptions.DomainException;

public class ApplicationException extends RuntimeException {
    public ApplicationException(String message, DomainException ex) {
        super(message, ex);
    }
}
