package com.freshgoodies.fresh_goodies.controller;

import com.freshgoodies.fresh_goodies.entity.Favorite;
import com.freshgoodies.fresh_goodies.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/favorites")
public class FavoriteController {
    @Autowired
    private FavoriteService favoriteService;

    @PostMapping("/toggle")
    public Favorite toggleFavorite(@RequestParam Long userId, @RequestParam Long productId) {
        return favoriteService.toggleFavorite(userId, productId);
    }

    @GetMapping("/{userId}")
    public List<Favorite> getUserFavorites(@PathVariable Long userId) {
        return favoriteService.getUserFavorites(userId);
    }
}

