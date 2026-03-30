package com.Aryan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        // 1. Create a data object to be saved
        alien a = new alien();
        a.setMobile(1);
        a.setName("Anil Kumar");
        a.setMarks(100);

        // 2. Set up the Hibernate Configuration
        Configuration config = new Configuration(); 
        config.addAnnotatedClass(com.Aryan.alien.class);
        config.configure("hibernate.cfg.xml"); // Load settings from hibernate.cfg.xml

        // 3. Build a SessionFactory (to create sessions)
        SessionFactory sf = config.buildSessionFactory();
        
        // 4. Open a Session (to perform database operations)
        Session session = sf.openSession();
        
        // 5. Start a Transaction (required for saving data)
        Transaction transaction = session.beginTransaction(); 

        // 6. Save the data to the database
        session.persist(a);
        transaction.commit(); // Ensure changes are saved!

        System.out.println("Operation successful!");

        // 7. Clean up and close connections
        session.close();
        sf.close();
    }
}
