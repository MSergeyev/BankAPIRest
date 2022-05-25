package com.example.restapi.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Data
@Table(name = "customers")
public class Customers{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int balance;


    @OneToMany(cascade = CascadeType.ALL)
    private List<Operation> operation = new ArrayList<Operation>();


    public Customers() {
    }

    public Customers(int id, int balance) {
        this.id = id;
        this.balance = balance;

    }





}
