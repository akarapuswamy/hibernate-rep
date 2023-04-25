package connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConnectionUtil {
	 public static SessionFactory sessionfactoy;
	   public static SessionFactory sesntry() {
			Configuration configuration=new Configuration().configure("hiber.cfg.xml");
			sessionfactoy = configuration.buildSessionFactory();
			 return sessionfactoy;
		}

		public static Session getSession() {
			if(sessionfactoy==null) {	
				sessionfactoy=sesntry();
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
