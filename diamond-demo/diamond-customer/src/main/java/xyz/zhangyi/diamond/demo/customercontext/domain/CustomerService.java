package xyz.zhangyi.diamond.demo.customercontext.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.customercontext.south.port.repository.CustomerRepository;
import xyz.zhangyi.diamond.demo.customercontext.domain.exception.CustomerNotFoundException;
import xyz.zhangyi.diamond.demo.foundation.stereotype.DomainService;

import java.util.Optional;

@Service
@DomainService
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer customerOf(String customerId) {
        Optional<Customer> optCustomer = customerRepository.customerOf(customerId);
        return optCustomer.orElseThrow(CustomerNotFoundException::new);
    }
}
