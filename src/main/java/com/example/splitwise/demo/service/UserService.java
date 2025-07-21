package com.example.splitwise.demo.service;

import org.springframework.stereotype.Service;

import com.example.splitwise.demo.models.User;
import com.example.splitwise.demo.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;
    public UserService(UserRepository userRepository){
            this.userRepository = userRepository;
    }
    public User registerUser(String userName,String phoneNumber,String password){
            User user = new User();
            user.setName(userName);
            user.setPhoneNumber(phoneNumber);
            user.setHashedPassword(password);  // for now we store simple password

            User savedUser = userRepository.save(user);
            return savedUser;
    }
}
