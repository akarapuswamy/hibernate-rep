package com.annotion;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Load {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		con.configure("hiberAnnotion.cfg.xml");
		SessionFactory sess = con.buildSessionFactory();
		Session se=sess.openSession();
		Transaction ta =se.beginTransaction();
		 Student load = se.load(Student.class, 3);
		 System.out.println(load);
		ta.commit();
		se.close();	
	}

}
