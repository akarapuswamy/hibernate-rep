package com.annotion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	public static void main(String[] args) {
		Student s = new Student(1, "swamy", "akarapu", 32000.00);
//		Student s1 = new Student(2, "shiva", "mudigonda", 34000.00);
//     	Student s2 = new Student(3, "devendar", "burri", 35000.00);
//		Student s3 = new Student(4, "achithu", "sudda", 42000.00);
//		Student s4 = new Student(5, "sai", "erra", 88000.00);
//		Student sw[]= {s,s1,s2,s3,s4};
//    	Configuration con = new Configuration();
//		con.configure("hiberAnnotion.cfg.xml");
//		SessionFactory se=con.buildSessionFactory();
//		Session sef = se.openSession();
//		Transaction	tx = sef.beginTransaction();
//		sef.persist(s);
////		for(Student stu : sw ) {
////			sef.save(stu);
////		}
//		tx.commit();
//		sef.close();
		
	}
}
