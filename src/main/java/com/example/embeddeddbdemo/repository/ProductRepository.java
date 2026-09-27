package com.example.embeddeddbdemo.repository;

import com.example.embeddeddbdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}