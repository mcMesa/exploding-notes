package com.github.mcmesa.explodingnotes;

import com.github.mcmesa.explodingnotes.domain.Customer;
import com.github.mcmesa.explodingnotes.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomerRepositoryCommandLineRunner implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(CustomerRepositoryCommandLineRunner.class);

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void run(String... args) throws Exception {
        Customer customer = new Customer("Jack", "Daniels", "Admin");
        customerRepository.insert(customer);
        log.info("New User is created : " + customer);
    }
}
