package com.example.fooddelivery.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Restaurant {
    private String name;
    private RestaurantType type;
    private List<Article> articles;
    private Location location;
    // logo (image)
}
