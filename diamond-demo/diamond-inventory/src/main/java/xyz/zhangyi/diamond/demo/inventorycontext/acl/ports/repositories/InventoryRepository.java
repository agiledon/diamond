package xyz.zhangyi.diamond.demo.inventorycontext.acl.ports.repositories;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.Product;

import java.util.List;

@Repository
public interface InventoryRepository {
    List<Product> productsOf(List<String> productIds);
}
