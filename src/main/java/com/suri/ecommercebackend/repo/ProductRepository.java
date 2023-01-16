package com.suri.ecommercebackend.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suri.ecommercebackend.model.Product;
import com.suri.ecommercebackend.model.User;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    void deleteById(Long id);
    Optional<Product> findById (Long id);
}
