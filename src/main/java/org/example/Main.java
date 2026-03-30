package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        alien a = new alien();
        a.setMobile(1);
        a.setName("Aryan");
        a.setMarks(100);

       Configuration config = new Configuration() ;// for configure the database
        config.addAnnotatedClass(org.example.alien.class);
        config.configure("hibernate.cfg.xml");// load this file for the database configuration details
        // hey hybernate save this data to the sql
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); // begin the transaction



        session.persist(a); // to save a data into the database
        transaction.commit(); // commit the transaction
        System.out.println("Data saved successfully!");
    }
}