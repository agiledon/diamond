package xyz.zhangyi.diamond.demo.inventorycontext.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.foundation.stereotype.DomainService;
import xyz.zhangyi.diamond.demo.inventorycontext.south.port.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@DomainService
public class InventoryService {
    @Autowired
    private ProductRepository productRepository;

    public InventoryReview reviewInventory(List<PurchasedProduct> purchasedProducts) {
        List<String> productIds = purchasedProducts.stream().map(p -> p.productId()).collect(Collectors.toList());
        List<Product> products = productRepository.productsOf(productIds);

        List<Availability> availabilities = products.stream().map(p -> p.checkAvailability(purchasedProducts)).collect(Collectors.toList());
        return new InventoryReview(availabilities);
    }
}
