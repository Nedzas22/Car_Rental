package com.carRental.Car_Rental.services.auth;

import com.carRental.Car_Rental.dto.SignupRequest;
import com.carRental.Car_Rental.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignupRequest signupRequest);

    boolean hasCustomerWithEmail(String email);
}
