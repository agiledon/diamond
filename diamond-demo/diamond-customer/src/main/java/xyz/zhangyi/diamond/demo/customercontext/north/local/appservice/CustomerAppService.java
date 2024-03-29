package xyz.zhangyi.diamond.demo.customercontext.north.local.appservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.zhangyi.diamond.demo.customercontext.domain.Customer;
import xyz.zhangyi.diamond.demo.customercontext.domain.CustomerService;
import xyz.zhangyi.diamond.demo.customercontext.north.message.CustomerResponse;
import xyz.zhangyi.diamond.demo.foundation.exception.ApplicationException;
import xyz.zhangyi.diamond.demo.foundation.exception.DomainException;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Local;

@Service
@Local
public class CustomerAppService {
    @Autowired
    private CustomerService customerService;

    public CustomerResponse customerOf(String customerId) {
        try {
            Customer customer = customerService.customerOf(customerId);
            return CustomerResponse.from(customer);
        } catch (DomainException ex) {
            throw new ApplicationException("customer is not found", ex);
        }
    }
}