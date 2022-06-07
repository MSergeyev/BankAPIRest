package com.example.restapi.controller;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.*;
import java.util.ArrayList;

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



    @Transactional
    public ArrayList<String> getOperationL(int id, String startData, String endData) throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/prod_bank","postgres", "123");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT *  from Operation where customers_id = "+id+"  and data_time between '"+startData+"' and '"+endData+"'");
        while (resultSet.next()){
            list.add(resultSet.getString("customers_id")+ " "+ resultSet.getString("data_time")
                    + " " + resultSet.getString("summ"));

        }
            return list;
    }

}