package com.example.splitwise.demo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequestDTO {
    private String name;
    private String password;
    private String phoneNumber;

}
