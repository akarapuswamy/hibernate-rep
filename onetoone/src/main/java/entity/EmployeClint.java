package entity;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.hibernate.Session;

import util.HibernateUtil;

public class EmployeClint {
	public static void main(String[] args) {
	     LocalDate date = LocalDate.of(2000, 06, 10);
	     ZoneId defaultZonedId = ZoneId.systemDefault();
	     Date dob = Date.from(date.atStartOfDay(defaultZonedId).toInstant());
		Address address = new Address( 1-73, "turkayamjal", "rangareddy");
		Employee e1 = new Employee("swamy", 32000.000,dob , address);
		Session sess=HibernateUtil.opensession();
		sess.beginTransaction();
		sess.save(e1);
		sess.getTransaction().commit();
		HibernateUtil.closesession();
		
	}

}
