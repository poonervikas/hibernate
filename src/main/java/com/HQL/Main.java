package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.manytomany.Developer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session= factory.openSession();
		
		//single record
//		String queryString="from Developer where name='Pooner' ";
//		Query query=session.createQuery(queryString);
//		Developer d=(Developer) query.uniqueResult();
//		System.out.println(d.getName()+" : "+ d.getAge());
		
		
//		queryString="from Developer where name= ?1";
//		query=session.createQuery(queryString);
//		query.setParameter(1, "Vikas");
//		 d=(Developer) query.uniqueResult();
//		System.out.println(d.getName()+" : "+ d.getAge());
		
//		query=session.createQuery("from Developer where name=:n");
//		query.setParameter("n", "Ram");
//		 d=(Developer) query.uniqueResult();
//		System.out.println(d.getName()+" : "+ d.getAge());
//		
				
		//multiple records
//		queryString="from Developer";
//		 query=session.createQuery(queryString);
//		List<Developer> listOfDevelopers=query.list();
//		
//		for (Developer developer : listOfDevelopers) {
//			System.out.println(developer.getName()+" : "+ developer.getAge());
//		}
//		
		Transaction tx=session.beginTransaction();
		//Delete
//		queryString="delete from Developer where name=?1";
//		query=session.createQuery(queryString);
//		query.setParameter(1, "Vishal");
//		System.out.println("Deleted "+ query.executeUpdate()+ " rows");
		
		
		//Update
//		queryString="update Developer set age=?1 where name=?2";
//		query=session.createQuery(queryString);
//		query.setParameter(1,12);
//		query.setParameter(2, "Ram");
//		System.out.println("Updated "+ query.executeUpdate()+ " rows");
		
		//Join
//			TODO		
		tx.commit();
			
		session.close();
		factory.close();
	}

}
