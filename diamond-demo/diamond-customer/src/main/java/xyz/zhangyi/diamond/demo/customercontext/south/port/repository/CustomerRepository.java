package xyz.zhangyi.diamond.demo.customercontext.south.port.repository;

import org.springframework.stereotype.Repository;
import xyz.zhangyi.diamond.demo.customercontext.domain.Customer;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Port;
import xyz.zhangyi.diamond.demo.foundation.stereotype.PortType;

import java.util.Optional;

@Repository
@Port(PortType.Repository)
public interface CustomerRepository {
    Optional<Customer> customerOf(String customerId);
}
