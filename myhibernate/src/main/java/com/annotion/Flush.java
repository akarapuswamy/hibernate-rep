package com.annotion;

import org.hibernate.Session;

import com.sessionUtil.SessionUtil;

public class Flush {
	public static void main(String[] args) {
		Session session = SessionUtil.getSession();
		session.beginTransaction();
		Student s = session.get(Student.class, 3);
		s.setName("asdfghjk");
		s.setLastname("qwerty");
		session.flush();
		SessionUtil.CloseSess();
		
		
	}

}
