package com.example.productapi.adapters.persistence;

import com.example.productapi.domain.model.Product;
import com.example.productapi.domain.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<Product, Long>, ProductRepository {
    @Override
    Page<Product> findAll(Pageable pageable);
}
