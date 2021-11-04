package com.xml_mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	Configuration conf=new Configuration();
	conf.configure("hibernate.cfg.xml");
	
	Laptop laptop=new Laptop(5,"DELL","Inspiron 5559");
	
	SessionFactory factory=conf.buildSessionFactory();
	Session session= factory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(laptop);
	
	tx.commit();
	session.close();
	factory.close();
}
}
