package queryshql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import connection.ConnectionUtil;

public class Select {
	public static void main(String[] args) {
		Configuration con = new Configuration();
		SessionFactory sef=con.configure("hiber.cfg.xml").buildSessionFactory();
		Session sess= sef.getCurrentSession();
		List<Employee> ff=sess.createQuery("FRom swamy").list();
		for (Employee employee : ff) {
			System.out.println(employee);	
		
		sess.getTransaction().commit();
		ConnectionUtil.CloseSess();
	}
	}
}
