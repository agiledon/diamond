package xyz.zhangyi.diamond.demo.foundation.exception;

public class ApplicationException extends RuntimeException {
    public ApplicationException(String message, DomainException ex) {
        super(message, ex);
    }
}
