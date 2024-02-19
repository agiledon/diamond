package xyz.zhangyi.diamond.demo.ordercontext.south.port.repositories;

import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.ordercontext.domain.shoppingcart.ShoppingCart;

import java.util.Optional;

@Port(PortType.Repository)
public interface ShoppingCartRepository {
    Optional<ShoppingCart> customerShoppingCart(String customerId);

    void save(ShoppingCart shoppingCart);
}
