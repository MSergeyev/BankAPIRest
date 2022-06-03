package com.example.restapi.controller;


import com.example.restapi.dao.Dao;
import com.example.restapi.model.Customers;
import com.example.restapi.model.Operation;
import com.example.restapi.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;



@RestController
@RequestMapping("/api")
public class Controllers {

    @Autowired
    BankService bankService;

    @Autowired
    OperInsertRepository operInsertRepository;

    @GetMapping("/getBalance/{id}")
    public String getBalance(@Validated @PathVariable int id) {
        try {
            return bankService.getBalance(id) + "";

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return "Id не найден " + e;
        }


    }



    @PostMapping("/putMoney/")
    public String putMoney(@Validated @RequestBody Customers customers) {
        int balance = 0;
        try {
            balance = bankService.getBalance(customers.getId());

        } catch (EntityNotFoundException e) {
            return "ID не найден";
        } catch (Exception e) {
            return "ошибка 0 " + e;
        }
        int PutMoney = customers.getBalance();
        if (PutMoney <= 0) {
            return balance + " ошибка при выполнении операции";
        }
        customers.setBalance(balance + PutMoney);
        bankService.createacc(customers);
        operInsertRepository.insertWithQuery(balance, customers.getId());
        return "Успешно добавлено " + balance;


    }


    @PostMapping("/takeMoney")
    public String takeMoney(@RequestBody Customers customers) {

        int balance = 0;
        try {
            balance = bankService.getBalance(customers.getId());
        } catch (EntityNotFoundException e) {
            return "ID не найден";
        } catch (Exception e) {
            return "ошибка 0 " + e;
        }
        int TakeMoney = customers.getBalance();
        if (TakeMoney <= 0) {
            return balance + "недостаточно средств ";
        }
        customers.setBalance(balance - TakeMoney);
        bankService.createacc(customers);
        operInsertRepository.insertWithQuery(balance, customers.getId());
        return "Успешно отнято " + balance;

    }




}