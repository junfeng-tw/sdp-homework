package com.example.productapi.application;

import com.example.productapi.domain.model.Product;
import com.example.productapi.domain.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getProducts(int page, int size) {
        size = Math.min(size, 30); // Ensure size does not exceed 30
        Pageable pageable = PageRequest.of(page - 1, size);
        return productRepository.findAll(pageable);
    }
}


