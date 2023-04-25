package com.annotion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
	public static void main(String[] args) {
		Student w3 = new Student(2, "shivaaa", "goretiaa", 34400.00);
		Configuration con = new Configuration();
		con.configure("hiberAnnotion.cfg.xml");
		SessionFactory sess=con.buildSessionFactory();
		Session se=sess.openSession();
		Transaction ta =se.beginTransaction();
		int id =3;
		Student student = se.get(Student.class, 3);
		student.setName("asd");
		se.update(student);
		ta.commit();
		se.close();
		
		
	}

}
