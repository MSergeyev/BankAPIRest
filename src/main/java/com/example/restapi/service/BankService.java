package com.example.restapi.service;

import com.example.restapi.dao.Dao;
import com.example.restapi.dao.Repo;
import com.example.restapi.model.Customers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BankService {

    @Autowired
    private Repo repo;

    @Autowired
    Dao dao;


    public int getBalance(int id) {
        Customers customers = repo.getById(id);
        return customers.getBalance();

    }

    public void createacc(Customers customers) {
        repo.save(customers);

    }




}
