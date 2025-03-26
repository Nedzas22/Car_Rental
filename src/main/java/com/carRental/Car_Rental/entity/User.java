package com.carRental.Car_Rental.entity;

import com.carRental.Car_Rental.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
private String password;
private UserRole userRole;
}
