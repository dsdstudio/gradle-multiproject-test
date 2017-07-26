package net.dsdstudio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by bhkim on 2016. 8. 28..
 */
@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public void test() {
        customerRepository.findAll().forEach(a -> {
            System.out.println(a);
        });
    }
}
