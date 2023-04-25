package com.sessionUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {
   public static SessionFactory sessionfactoy;
   public static SessionFactory sesnFtry() {
		Configuration configuration=new Configuration().configure("hiberAnnotion.cfg.xml");
		sessionfactoy = configuration.buildSessionFactory();
		 return sessionfactoy;
	}

	public static Session getSession() {
		if(sessionfactoy==null) {	
			sessionfactoy=sesnFtry();
		}
		return sessionfactoy.openSession();
		
	}
	public static void CloseSess() {
		if (getSession()!=null) {
			getSession().close();
			
		}
	}
	public static void main(String[] args) {
		System.out.println(getSession().isConnected());
	}
	
}
