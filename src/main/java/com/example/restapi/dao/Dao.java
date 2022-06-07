package com.example.restapi.dao;


import com.example.restapi.model.Operation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Dao extends CrudRepository<Operation, Integer> {


}
