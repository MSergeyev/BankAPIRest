package com.example.restapi;

import com.example.restapi.model.Customers;
import com.example.restapi.model.Operation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
//
//        Customers customer = new Customers();
//        Operation oper = new Operation();
////        oper.setId(1);
////        oper.setDatatime(2022-05-27);
////        oper.setSumm(200);
//            Configuration con = new Configuration().configure()
//            .addAnnotatedClass(Operation.class)
//            .addAnnotatedClass(Customers.class);
//    StandardServiceRegistryBuilder sbild = new StandardServiceRegistryBuilder()
//            .applySettings(con.getProperties());
//    SessionFactory sf = con.buildSessionFactory(sbild.build());
//    Session session = sf.openSession();
//        session.beginTransaction();
//        session.save(customer);
//        session.save(oper);
//        session.getTransaction().commit();



    }

}
