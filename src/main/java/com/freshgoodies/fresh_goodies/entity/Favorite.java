package com.freshgoodies.fresh_goodies.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long productId;
    private boolean isFavorite;
}
