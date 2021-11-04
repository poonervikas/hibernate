package com.pagination_nativequeries;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session= factory.openSession();
//		Transaction tx=session.beginTransaction();
//		for(int i=0;i<100;i++) {
//			Person p=new Person(i,"Vikas "+ i,i+10);
//			session.save(p);
//		}
		
		Query q=session.createQuery("from Person");
		q.setFirstResult(5);
		q.setMaxResults(10);
		
		List<Person> list=q.list();
		for (Person person : list) {
			System.out.println(person.getId()+" : "+person.getName()+" : "+person.getAge());
		}
		
		// Native Queries
		NativeQuery nq=session.createSQLQuery("Select * from Person where age > 56 and name like '%0'");
		
		List<Object[]> l=nq.list();
		for (Object[] person : l) {
			System.out.println(Arrays.toString(person));
		}
//		tx.commit();
		session.close();
		factory.close();
		
	}

}
