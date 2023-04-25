package queryshql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.mysql.cj.Query;
import com.mysql.cj.xdevapi.SessionFactory;

import connection.ConnectionUtil;

public class SelectAllQeries {

	public static void main(String[] args) {
		Session session = ConnectionUtil.getSession();
		session.getTransaction().begin();
	  org.hibernate.Query qu= session.createQuery("from Employee");
	   List<Employee> employee= qu.list();
	   for (Employee employee2 : employee) {
		   System.out.println(employee2);
		   ConnectionUtil.CloseSess();
		
	}
   }
	}