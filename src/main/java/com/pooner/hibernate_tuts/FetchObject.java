package com.pooner.hibernate_tuts;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchObject {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
//		Student s1= session.get(Student.class, 135);
//		System.out.println(s1);
//		
//		Student s2= session.get(Student.class, 7);
//		System.out.println(s2);
		
		Student s3= session.load(Student.class, 135);
		System.out.println(s3);
		
		Student s4= session.load(Student.class, 135);
		System.out.println(s4);
	}
}
