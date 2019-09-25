package com.intelligix.serverproductmanagement.repository;

import com.intelligix.serverproductmanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
