package xyz.zhangyi.diamond.demo.foundation.exceptions;

public class ApplicationException extends RuntimeException {
    public ApplicationException(String message, DomainException ex) {
        super(message, ex);
    }
}
