package Util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConnection {
public static SessionFactory sf;
	
	public static SessionFactory sess() {
	Configuration conf = new Configuration().configure("hiberCurd.cfg.xml");
	sf=conf.buildSessionFactory();
	return sf;    
	}
	
	public static Session opensession() {
		if (sf==null) {
			sf=sess();
		}
		return sf.openSession();
	}
	
	public static void closesession() {
		if (opensession()!=null) {
			opensession().close();	
		}
	}
	public static void main(String[] args) {
		System.out.println(opensession());
	}	


}
