package com.example.fooddelivery.model;

import com.example.fooddelivery.enumeration.ArticleType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Article {
    private String name;
    private Float price;
    private ArticleType type;
    private Restaurant restaurant;
    private Integer amount;
    private String description;
    // image
}
