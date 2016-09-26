package net.dsdstudio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by bhkim on 2016. 8. 28..
 */
@SpringBootApplication
public class WebApp {
    public static void main(String[] args) {
        SpringApplication.run(WebApp.class, args);
    }

    @Bean
    public CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            System.out.println(customerRepository);
        };
    }
}
