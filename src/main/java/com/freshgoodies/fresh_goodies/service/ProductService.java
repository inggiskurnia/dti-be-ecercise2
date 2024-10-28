package com.freshgoodies.fresh_goodies.service;

import com.freshgoodies.fresh_goodies.entity.Product;
import com.freshgoodies.fresh_goodies.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getAllProducts(String keyword) {
        if (keyword != null && !keyword.isEmpty()) {
            return productRepository.findByNameContaining(keyword);
        }
        return productRepository.findAll();
    }


    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
