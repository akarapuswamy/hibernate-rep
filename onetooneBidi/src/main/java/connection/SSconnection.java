package connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
																																																																																																																																																																																																																																																																																																																													
public class SSconnection {
	private static SessionFactory sf;

	private static SessionFactory sessionfa() {
		Configuration con = new Configuration().configure("hiberber.cfg.xml");
		sf = con.buildSessionFactory();
		return sf;
	}

	public static Session openSess() {
		if (sf == null) {
			sf = sessionfa();
		}
		return sf.openSession();
	}
	public static void closes() {
		if (openSess() != null) {
			openSess().close();
		}
	}
	public static void main(String[] args) {
		System.out.println(openSess());
	}
}