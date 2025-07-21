package com.example.splitwise.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.splitwise.demo.models.User;

public interface UserRepository extends JpaRepository<User,Long>{
    
}
