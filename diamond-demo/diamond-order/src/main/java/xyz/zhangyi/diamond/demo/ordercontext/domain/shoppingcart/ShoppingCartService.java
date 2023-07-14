package xyz.zhangyi.diamond.demo.ordercontext.domain.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Product;
import xyz.zhangyi.diamond.demo.ordercontext.south.port.repositories.ShoppingCartRepository;

import java.util.List;
import java.util.Optional;

public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepo;

    public void removeItems(String customerId, List<Product> purchasedProducts) {
        ShoppingCart shoppingCart = loadShoppingCart(customerId);
        if (shoppingCart == null) return;

        shoppingCart.removeItems(purchasedProducts);
        shoppingCartRepo.save(shoppingCart);
    }

    private ShoppingCart loadShoppingCart(String customerId) {
        Optional<ShoppingCart> optionalShoppingCart = shoppingCartRepo.customerShoppingCart(customerId);

        if (!optionalShoppingCart.isPresent()) {
            return null;
        }

        ShoppingCart shoppingCart = optionalShoppingCart.get();
        return shoppingCart;
    }
}
