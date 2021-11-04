package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Employee p=new Employee("rambo",23);
		Passport pass=new Passport(56, "ind area phase-1 mohali");
		
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session= factory.openSession();
		
		p.setPassport(pass);
		pass.setEmployee(p);
		
		Transaction  tx=session.beginTransaction();
		session.save(p);
		session.save(pass);
		
		
		
		tx.commit();
		System.out.println(pass.getEmployee().getName());
		session.close();
		factory.close();
	}

}
