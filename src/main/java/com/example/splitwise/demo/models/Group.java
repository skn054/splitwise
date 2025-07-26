package com.example.splitwise.demo.models;

import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "user_groups")
public class Group extends BaseModel{

    
    private String name;

    @JoinTable(name="user_groups_members",
            joinColumns = @JoinColumn(name="group_id"),// owning entity
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @ManyToMany
    private List<User> members;
    @ManyToOne
    @JoinColumn(name = "admin_user_id")
    private User admin;
    @OneToMany(mappedBy = "group")
    private List<Expense> expenses;
   
    

}
