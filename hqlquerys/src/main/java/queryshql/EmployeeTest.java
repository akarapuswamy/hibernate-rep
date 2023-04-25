package queryshql;

import org.hibernate.Session;

import connection.ConnectionUtil;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1= new Employee(1, "swamy", "akarapu", 3200.00);
		Employee e2= new Employee(2, "shiva", "gorethi", 32300.00);
		Employee e3= new Employee(3, "swamy", "ak", 3455.00);
		Employee e4= new Employee(4, "sddff", "akaddddd", 67700.00);
		Employee emp[]= {e1,e2,e3,e4};
		Session sess=ConnectionUtil.getSession();sess.beginTransaction();
		for(Employee emoo: emp) {
			sess.save(emoo);
		}
		sess.getTransaction().commit();
		System.out.println("ok");
		ConnectionUtil.CloseSess();
	}

}
