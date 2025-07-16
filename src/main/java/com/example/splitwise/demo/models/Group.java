package com.example.splitwise.demo.models;

import java.util.List;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;


public class Group {

    private int id;
    private String name;
    @ManyToMany
    private List<User> users;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User admin;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
   
    

}
