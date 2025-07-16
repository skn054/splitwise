package com.example.splitwise.demo.models;

import java.util.List;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String desc;

    @ManyToOne
    @JoinColumn(name="userId")
    private User createdBy;
    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;

    @OneToMany(mappedBy = "expense")
    private List<UserExpense> userExpenses;
    private double amount;
    private SplitBy splitBy;
    


}
