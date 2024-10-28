package com.freshgoodies.fresh_goodies.service;

import com.freshgoodies.fresh_goodies.entity.Favorite;
import com.freshgoodies.fresh_goodies.repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FavoriteService {
    @Autowired
    private FavoriteRepository favoriteRepository;

    public List<Favorite> getUserFavorites(Long userId) {
        return favoriteRepository.findByUserId(userId);
    }
}
