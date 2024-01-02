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
public class Cart {
    private Customer customer;
    private List<ArticleWithAmount> articles;
    private Float price;
}
