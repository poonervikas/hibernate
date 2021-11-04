package com.pooner.hibernate_tuts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration conf=new Configuration();
        conf.configure("hibernate.cfg.xml");
        
        //SessionFactory is an interface
        SessionFactory factory=conf.buildSessionFactory();
        
        //creating student object
        Student std=new Student();
        std.setCity("Kinnaur");
        std.setId(145);
        std.setName("Virat kohli");
        
        //saving into db
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        session.save(std);
        tx.commit();
        session.close();
        
    }
}
