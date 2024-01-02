package com.example.fooddelivery.model;

import com.example.fooddelivery.enumeration.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Order {
    private List<ArticleWithAmount> article;
    private Restaurant restaurant;
    private Date date;
    private Float price;
    private OrderStatus status;
}
