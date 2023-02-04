 package client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee e1 = new Employee("swamy", "akarapu", 3200.00);
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sess = con.buildSessionFactory();
		Session session = sess.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e1);
		tx.commit();
		sess.close();
		
		
	}
}
