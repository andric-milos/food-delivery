package com.example.fooddelivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Customer extends User {
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
}
