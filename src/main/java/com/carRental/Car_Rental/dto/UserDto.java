package com.carRental.Car_Rental.dto;

import com.carRental.Car_Rental.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
}
