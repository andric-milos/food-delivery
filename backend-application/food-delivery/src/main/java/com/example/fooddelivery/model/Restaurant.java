package com.example.fooddelivery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "type_id", nullable = false)
    private RestaurantType type;
    @OneToMany(mappedBy = "restaurant")
    private List<Article> articles;
    @ManyToOne
    @JoinColumn(name = "location_id", nullable = false)
    private Location location;
    @OneToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
    // logo (image)
}
