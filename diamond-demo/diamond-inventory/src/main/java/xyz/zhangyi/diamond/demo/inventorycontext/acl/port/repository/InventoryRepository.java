package xyz.zhangyi.diamond.demo.inventorycontext.acl.port.repository;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;
import xyz.zhangyi.diamond.demo.inventorycontext.domain.Product;

import java.util.List;

@Repository
@Port(PortType.Repository)
public interface InventoryRepository {
    List<Product> productsOf(List<String> productIds);
}
