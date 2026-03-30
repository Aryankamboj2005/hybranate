package com.Aryan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        alien a = new alien();
        a.setMobile(1);
        a.setName("Anil Kumar");
        a.setMarks(100);

       Configuration config = new Configuration() ;// for configure the database
        config.addAnnotatedClass(com.Aryan.alien.class);
        config.configure("hibernate.cfg.xml");// load this file for the database configuration details



        // hey hybernate save this data to the sql
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        Transaction transaction = session.beginTransaction(); // Start the transaction

        alien a1 = session.find(alien.class,1); // (class name , primary key)

        session.remove(a1); // deleting the a1 object in a1 we have passed
                              // the class name with the primary key
        transaction.commit(); // Push to DB!
        System.out.println("successfully deleted the data");

        session.close();
        sf.close();
    }
}
