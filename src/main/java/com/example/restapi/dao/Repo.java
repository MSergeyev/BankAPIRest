package com.example.restapi.dao;

import com.example.restapi.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Repo extends CrudRepository<Customers, Integer>, JpaRepository<Customers, Integer>{

}
