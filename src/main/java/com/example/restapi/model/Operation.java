package com.example.restapi.model;


import lombok.Data;

import javax.persistence.*;


@Table(name = "operation")
@Data
@Entity
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int DataTime;

    private int summ;



    public Operation() {
    }

}
