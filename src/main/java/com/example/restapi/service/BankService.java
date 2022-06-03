package com.example.restapi.service;

import com.example.restapi.controller.OperInsertRepository;
import com.example.restapi.dao.Dao;
import com.example.restapi.dao.Repo;
import com.example.restapi.model.Customers;


import com.example.restapi.model.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class BankService {

    @Autowired
    private Repo repo;

    @Autowired
    Dao dao;

    @Autowired
    OperInsertRepository operInsertRepository;

    public int getBalance(int id) {
        Customers customers = repo.getById(id);
        return customers.getBalance();

    }

    public void createacc(Customers customers) {
        repo.save(customers);

    }

    public void opersave(Operation operation) {
        dao.save(operation);

    }





}
