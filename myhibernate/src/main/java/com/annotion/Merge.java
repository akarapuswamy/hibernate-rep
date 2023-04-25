package com.annotion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sessionUtil.SessionUtil;

public class Merge {
	public static void main(String[] args) { 
		Student student= null;
		try (Session session =SessionUtil.getSession();){
		student = session.get(Student.class, 4);
		}catch (Exception e) {
			e.printStackTrace();
		}
		student.setName("swamy");
		try(Session session = SessionUtil.getSession();) {
			Student student2 = session.get(Student.class, 4);
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();	
		}
		}
}
