package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pagination_nativequeries.Person;

public class Caching {
	public static void main(String[] args) {
		
		//SECOND LEVEL CACHE
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session1= factory.openSession();
		Person p1=session1.get(Person.class, 51);
		System.out.println(p1.getId()+"  |  "+p1.getName()+" |  "+p1.getAge());
		session1.close();
		
		Session session2= factory.openSession();
		Person p2=session2.get(Person.class, 51);
		System.out.println(p2.getId()+"  |  "+p2.getName()+" |  "+p2.getAge());
		
		session2.close();
		factory.close();
	}

}
