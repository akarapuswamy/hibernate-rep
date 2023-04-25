package com.annotion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Studentget {
	public static void main(String[] args) {
		Student w2 = new Student(2, "shiva", "goreti", 3500.00);
		Configuration con = new Configuration();
		con.configure("hiberAnnotion.cfg.xml");
		SessionFactory sess = con.buildSessionFactory();
		Session se=sess.openSession();
		Transaction ta =se.beginTransaction();
		Student student = se.get(Student.class, 2);
		System.out.println(student);
		ta.commit();
		se.close();	
	}
}
