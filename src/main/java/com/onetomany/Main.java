package com.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		Question ques=new Question();
		ques.setQuestionId(1);
		ques.setQuestion("what is hibernate?");
		
		Answer ans1=new Answer();
		ans1.setAnswerId(100);
		ans1.setAnswer("ORM tool");
		ans1.setQuestion(ques);
		
		Answer ans2=new Answer();
		ans2.setAnswerId(101);
		ans2.setAnswer("java framework");
		ans2.setQuestion(ques);
		
		List<Answer> listOfAnswers=new ArrayList<Answer>();
		listOfAnswers.add(ans1);
		listOfAnswers.add(ans2);
		
		ques.setAnswers(listOfAnswers);
			
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory factory=conf.buildSessionFactory();
		Session session= factory.openSession();
				
		Transaction  tx=session.beginTransaction();
		session.save(ques);
		session.save(ans1);
		session.save(ans2);
//		System.out.println(session.get(Question.class, 1).getAnswers().get(0).getAnswer());
//		System.out.println(session.get(Answer.class, 101).getQuestion().getQuestion());		
		tx.commit();
		session.close();
		factory.close();
	}

}
