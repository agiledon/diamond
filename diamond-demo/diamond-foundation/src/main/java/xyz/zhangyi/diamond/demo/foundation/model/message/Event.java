package xyz.zhangyi.diamond.demo.foundation.model.message;

import java.io.Serializable;

public interface Event extends Serializable {
    String eventId();
}
