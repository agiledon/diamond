package xyz.zhangyi.diamond.demo.ordercontext.southbound.port.repositories;

import xyz.zhangyi.diamond.demo.ordercontext.domain.shoppingcart.ShoppingCart;

import java.util.Optional;

public interface ShoppingCartRepository {
    Optional<ShoppingCart> customerShoppingCart(String customerId);

    void save(ShoppingCart shoppingCart);
}
