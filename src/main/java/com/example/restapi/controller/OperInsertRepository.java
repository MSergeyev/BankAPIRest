package com.example.restapi.controller;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class OperInsertRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void insertWithQuery(int summ, int customers_id) {
        entityManager.createNativeQuery("INSERT INTO operation (summ, customers_id) values(?,?)")
                .setParameter(1, summ)
                .setParameter(2, customers_id)
                .executeUpdate();
    }
}