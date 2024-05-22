package com.example.productapi.domain.repository;

import com.example.productapi.domain.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepository {
    Page<Product> findAll(Pageable pageable);
}
