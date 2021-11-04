package com.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onetomany.Answer;
import com.onetomany.Question;

public class Main {

	public static void main(String[] args) {

		Developer d1=new Developer();
		d1.setName("Vikas");
		d1.setAge(23);
		
		Developer d2=new Developer();
		d2.setName("Pooner");
		d2.setAge(32);
		
		Project p1=new Project();
		p1.setProjectId(1000);
		p1.setName("Quiz Portal");
		
		Project p2=new Project();
		p2.setProjectId(1001);
		p2.setName("Polling App");
		
		List<Project> projectList=new ArrayList<Project>();
		projectList.add(p1);
		projectList.add(p2);
		List<Developer> developerList=new ArrayList<Developer>();
		developerList.add(d1);
		developerList.add(d2);
		
		d1.setProjects(projectList);
		d2.setProjects(projectList);

		p1.setDevelopers(developerList);
		p2.setDevelopers(developerList);
		
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session= factory.openSession();
				
		Transaction  tx=session.beginTransaction();
		session.save(d1);
		session.save(d2);
		session.save(p1);
		session.save(p2);

		
		
		tx.commit();
		session.close();
		factory.close();
	}

}
