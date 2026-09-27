package com.example.embeddeddbdemo;

import com.example.embeddeddbdemo.model.Product;
import com.example.embeddeddbdemo.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmbeddedDbDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmbeddedDbDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(ProductRepository repository) {
        return args -> {
            repository.save(new Product("Laptop", 1200.00));
            repository.save(new Product("Smartphone", 800.00));
        };
    }
}