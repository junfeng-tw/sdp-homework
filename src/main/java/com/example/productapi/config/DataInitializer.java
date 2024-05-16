package com.example.productapi.config;

import com.example.productapi.model.Product;
import com.example.productapi.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    private final ProductRepository productRepository;

    public DataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Bean
    public CommandLineRunner loadData() {
        return args -> {
            if (productRepository.count() == 0) {
                productRepository.save(new Product(null,"Product 1", "http://example.com/image1.jpg", 10.0, 100));
                productRepository.save(new Product(null,"Product 2", "http://example.com/image2.jpg", 20.0, 200));
                productRepository.save(new Product(null,"Product 3", "http://example.com/image3.jpg", 30.0, 300));
                productRepository.save(new Product(null,"Product 4", "http://example.com/image4.jpg", 40.0, 400));
                productRepository.save(new Product(null,"Product 5", "http://example.com/image5.jpg", 50.0, 500));
            }
        };
    }
}
