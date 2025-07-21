package com.example.splitwise.demo.dto;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponseDTO {
    private HttpStatus status;
    private UserDTO userDTO;

}
