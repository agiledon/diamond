package xyz.zhangyi.diamond.demo.ordercontext.domain.shoppingcart;

import org.springframework.beans.factory.annotation.Autowired;
import xyz.zhangyi.diamond.demo.ordercontext.domain.order.Product;
import xyz.zhangyi.diamond.demo.ordercontext.southbound.port.repositories.ShoppingCartRepository;

import java.util.List;
import java.util.Optional;

public class ShoppingCartService {
    @Autowired
    private ShoppingCartRepository shoppingCartRepo;

    public void removeItems(String customerId, List<Product> purchasedProducts) {
        Optional<ShoppingCart> optionalShoppingCart = shoppingCartRepo.customerShoppingCart(customerId);

        if (!optionalShoppingCart.isPresent()) {
            return;
        }

        ShoppingCart shoppingCart = optionalShoppingCart.get();
        shoppingCart.removeItems(purchasedProducts);

        shoppingCartRepo.save(shoppingCart);
    }
}
