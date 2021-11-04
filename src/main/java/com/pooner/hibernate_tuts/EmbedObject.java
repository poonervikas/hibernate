package com.pooner.hibernate_tuts;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class EmbedObject {
	
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory= cfg.buildSessionFactory();
		
		Session session= factory.openSession();
		
		Person p=new Person();
		p.setName("Vikas Pooner");
		p.setAge(23);
		
		Address a=new Address();
		a.setCity("Mohali");
		a.setHouseNumber("#H-476 phase-1, Mohali");
		
		p.setAddress(a);
		
		Transaction tx=session.beginTransaction();
		session.save(p);
		tx.commit();
		session.close();
		factory.close();
	}
}
