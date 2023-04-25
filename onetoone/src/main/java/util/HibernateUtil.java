package util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
	public static SessionFactory sf;
	
	public static SessionFactory sess() {
	Configuration conf = new Configuration().configure("hibernate.cfg.xml");
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
