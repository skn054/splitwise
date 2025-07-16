package com.example.splitwise.demo.models;

import java.util.List;

public class Expense {

    private int id;
    private String desc;
    private List<User> userList;
    private List<User> paidBy;
    private double amount;
    private SplitBy Strategy;


}
