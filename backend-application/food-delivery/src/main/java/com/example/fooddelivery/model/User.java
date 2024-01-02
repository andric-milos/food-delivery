package com.example.fooddelivery.model;

import com.example.fooddelivery.enumeration.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate birthDate;
}
