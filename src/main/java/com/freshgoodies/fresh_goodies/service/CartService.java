package com.freshgoodies.fresh_goodies.service;

import com.freshgoodies.fresh_goodies.entity.CartItem;
import com.freshgoodies.fresh_goodies.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem addToCart(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }

    public List<CartItem> getUserCart(Long userId) {
        return cartItemRepository.findByUserId(userId);
    }


    public void deleteCartItem(Long id) {
        cartItemRepository.deleteById(id);
    }
}
