package com.example.restapi.service;

import com.example.restapi.controller.OperInsertRepository;
import com.example.restapi.dao.Dao;
import com.example.restapi.dao.Repo;
import com.example.restapi.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class BankService {


    @Autowired
    private Repo repo;

    @Autowired
    Dao dao;

    @Autowired
    OperInsertRepository operInsertRepository;

    public int getBalance(int id) {
        Customer customers = repo.getById(id);
        return customers.getBalance();

    }

    public void createacc(Customer customers) {
        repo.save(customers);

    }

    }

