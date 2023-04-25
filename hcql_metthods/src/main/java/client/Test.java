package client;

import org.hibernate.Session;

import connection.SSconnection;
import model.Employee;

public class Test {
	public static void main(String[] args) {
		Session sess = SSconnection.openSess();
		Employee e1 = new Employee(1, "swamy", "akarapu", 2300.00, "turkayamjal");
		Employee e2 = new Employee(2, "suresh", "Skarapu", 2800.00, "BN reddy");
		Employee e3 = new Employee(3, "raju", "ranamanpally", 32000.00, "maneguda");
		Employee e4 = new Employee(4, "vaishnav", "kethan", 48000.00, "ibrahimpatnam");
		Employee e5 = new Employee(5, "devendar", "burri", 550000.00, "Nagarjuna Sager Dam");
		Employee e6 = new Employee(5, "Achithu", "burri", 5800000.00, "Aliya");
		Employee [] ee= {e1,e2,e3,e4,e5,e6};
		sess.getTransaction().begin();
		for (Employee employee : ee) {
			System.out.println(sess.save(employee));
		}
	    sess.getTransaction().commit();
		sess.close();
		
		
	}

}
