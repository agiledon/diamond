package xyz.zhangyi.diamond.demo.customercontext.north.remote.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.zhangyi.diamond.demo.customercontext.north.message.CustomerResponse;
import xyz.zhangyi.diamond.demo.customercontext.north.local.appservice.CustomerAppService;
import xyz.zhangyi.diamond.demo.foundation.exception.ApplicationException;
import xyz.zhangyi.diamond.demo.foundation.stereotype.Remote;
import xyz.zhangyi.diamond.demo.foundation.stereotype.RemoteType;

@RestController
@RequestMapping(value="/customers")
@Remote(RemoteType.Resource)
public class CustomerResource {
    @Autowired
    private CustomerAppService customerAppService;

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerResponse> customerOf(@PathVariable String customerId) {
        try {
            CustomerResponse customerResponse = customerAppService.customerOf(customerId);
            return new ResponseEntity<>(customerResponse, HttpStatus.FOUND);
        } catch (ApplicationException ex) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
