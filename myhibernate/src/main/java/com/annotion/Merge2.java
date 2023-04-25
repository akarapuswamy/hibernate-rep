package com.annotion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Merge2 {
	public static void main(String[] args) {
	Student w4 = new Student(4, "shttt", "gaattttt", 34400.00);
	Configuration con = new Configuration();
	con.configure("hiberAnnotion.cfg.xml");
	SessionFactory sess = con.buildSessionFactory();
	Session se=sess.openSession();
	Transaction ta =se.beginTransaction();
	Student student = se.get(Student.class,4);
	student.setFee(455555.00);
	System.out.println(student);
	se.merge(student);
	ta.commit();
	se.close();
	}
}
