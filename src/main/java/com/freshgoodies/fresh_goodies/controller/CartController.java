package com.freshgoodies.fresh_goodies.controller;

import com.freshgoodies.fresh_goodies.entity.CartItem;
import com.freshgoodies.fresh_goodies.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public CartItem addToCart(@RequestBody CartItem cartItem) {
        return cartService.addToCart(cartItem);
    }

    @GetMapping("/{userId}")
    public List<CartItem> getUserCart(@PathVariable Long userId) {
        return cartService.getUserCart(userId);
    }

    @PutMapping("/{id}")
    public CartItem updateCartItem(@PathVariable Long id, @RequestBody CartItem cartItem) {
        return cartService.updateCartItem(id, cartItem);
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable Long id) {
        cartService.deleteCartItem(id);
    }
}

