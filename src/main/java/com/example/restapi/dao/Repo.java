package com.example.restapi.dao;

import com.example.restapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface Repo extends JpaRepository<Customer, Integer>{

}
