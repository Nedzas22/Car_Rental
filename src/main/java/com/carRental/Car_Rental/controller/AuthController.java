package com.carRental.Car_Rental.controller;

import com.carRental.Car_Rental.dto.SignupRequest;
import com.carRental.Car_Rental.dto.UserDto;
import com.carRental.Car_Rental.services.auth.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignupRequest signupRequest) {
        if(authService.hasCustomerWithEmail(signupRequest.getEmail()))
            return new ResponseEntity<>("Email already in use", HttpStatus.CONFLICT);

      UserDto createdCusotmerDto =  authService.createCustomer(signupRequest);
      if(createdCusotmerDto == null) {
          return new ResponseEntity<>("Account is not created", HttpStatus.BAD_REQUEST);
      }
      return new ResponseEntity<>(createdCusotmerDto, HttpStatus.CREATED);
    }
}
