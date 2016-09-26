package net.dsdstudio;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by bhkim on 2016. 8. 28..
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}