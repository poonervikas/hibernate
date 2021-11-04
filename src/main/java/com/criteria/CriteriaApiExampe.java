package com.criteria;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.pagination_nativequeries.Person;

public class CriteriaApiExampe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session= factory.openSession();
		org.hibernate.Criteria c=session.createCriteria(Person.class);
		
		//c.add(Restrictions.eq("id",15));
		
		//c.add(Restrictions.gt("age", 45));
		
		//Mehods available for pagination also
		
		c.add(Restrictions.like("name", "%5"));
		List<Person> list=c.list();
		for (Person person : list) {
			System.out.println(person.getId()+" : "+person.getName()+" : "+person.getAge());
		}
		
		session.close();
		factory.close();
	}

}
