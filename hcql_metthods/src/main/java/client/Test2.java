package client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import connection.SSconnection;
import model.Employee;

public class Test2 {
	public static void main(String[] args) {
		Session sess = SSconnection.openSess();
		sess.getTransaction().begin();
		Criteria cr=sess.createCriteria(Employee.class);
	//	cr.addOrder(Order.asc("EmpFirstName")); // asc order
	//	cr.addOrder(Order.desc("EmpId")); // des order
	//	cr.addOrder(Order.desc("EmpSalary"));
	//	cr.add(Restrictions.between("EmpFirstName", "swamy", "raju"));
	//	cr.add(criterion)
		List<Employee> e1 = cr.list();
		for (Employee employee : e1) {
			System.out.println(employee);
		}
		sess.getTransaction().commit();
		SSconnection.closes();
		
	}
	
}
