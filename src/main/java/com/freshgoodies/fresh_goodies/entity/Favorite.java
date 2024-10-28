package com.freshgoodies.fresh_goodies.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;
    private Long productId;
    private boolean isFavorite;

    public Favorite(Long userId, Long productId, boolean isFavorite) {
        this.userId = userId;
        this.productId = productId;
        this.isFavorite = isFavorite;
    }
}
