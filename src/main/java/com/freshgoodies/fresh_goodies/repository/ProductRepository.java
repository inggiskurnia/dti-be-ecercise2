package com.freshgoodies.fresh_goodies.repository;

import com.freshgoodies.fresh_goodies.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContaining(String keyword);
}
