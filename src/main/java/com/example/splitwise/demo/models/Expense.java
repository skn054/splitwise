package com.example.splitwise.demo.models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="expenses")
public class Expense extends BaseModel{

   
    private String description;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User createdBy;
    @ManyToOne
    @JoinColumn(name="group_id")
    private Group group;

    @OneToMany(mappedBy = "expense")
    private List<UserExpense> userExpenses;

     @Column(precision = 10, scale = 2)
    private BigDecimal totalAmount;

     @Enumerated(EnumType.STRING)
    private SplitBy splitBy;

    
    


}
