package com.freshgoodies.fresh_goodies.controller;

import com.freshgoodies.fresh_goodies.entity.Product;
import com.freshgoodies.fresh_goodies.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @GetMapping
    public List<Product> getAllProducts(@RequestParam(required = false) String keyword) {
        return productService.getAllProducts(keyword);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}
