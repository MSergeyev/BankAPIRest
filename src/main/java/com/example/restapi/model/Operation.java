package com.example.restapi.model;



import lombok.Data;



import javax.persistence.*;
import java.sql.Timestamp;


@Table(name = "operation")
@Data
@Entity
public class Operation {

    @ManyToOne
    private Customer customers;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private Timestamp data_time;

    private int summ;



    public Operation() {
    }


}
