package com.thriftiess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thriftiess.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}