package com.example.splitwise.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.splitwise.demo.dto.RegisterUserRequestDTO;
import com.example.splitwise.demo.dto.RegisterUserResponseDTO;
import com.example.splitwise.demo.dto.UserDTO;
import com.example.splitwise.demo.models.User;
import com.example.splitwise.demo.service.UserService;


@RestController
public class UserController {

    private UserService userService;
    public UserController(UserService userService){
        this.userService = userService;
    }

    public RegisterUserResponseDTO registerUser(RegisterUserRequestDTO registerUserRequestDTO){
            String userName = registerUserRequestDTO.getName();
            String password = registerUserRequestDTO.getPassword();
            String phoneNumber = registerUserRequestDTO.getPhoneNumber();
            User user = userService.registerUser(userName, phoneNumber,password);
            RegisterUserResponseDTO responseDTO= new RegisterUserResponseDTO();
            UserDTO userDTO = new UserDTO();
            userDTO.setName(user.getName());
            userDTO.setPhoneNumber(user.getPhoneNumber());
            responseDTO.setStatus(HttpStatus.OK);
            responseDTO.setUserDTO(userDTO);


            return responseDTO;
    }

}
