package com.example.splitwise.demo.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;
    private String name;
    @Column(unique = true, nullable = false)
    private String phoneNumber;
    private String hashedPassword;
    @ManyToMany
    private List<Group> groups;
    @OneToMany
    private List<Expense> expenses;
    @OneToMany(mappedBy = "user")
    private List<UserExpense> userExpenses;
    

}
