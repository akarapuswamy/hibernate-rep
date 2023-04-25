package util.com;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class StudentClient {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2001, 03, 11);
		ZoneId defaultZonedId = ZoneId.systemDefault();
		Date dob = Date.from(date.atStartOfDay(defaultZonedId).toInstant());
		Student s1 = new Student(dob,"BN reddy");
		EntityManagerFactory mf = Persistence.createEntityManagerFactory("util.com");
	    EntityManager em = mf.createEntityManager();
	    EntityTransaction tr =em.getTransaction();
	    tr.begin();
	    em.persist(s1);
	    tr.commit();
	    Query q =em.createQuery("from student");
	    List resultlist=q.getResultList();
	    System.out.println(resultlist);
	    em.close();
}
}
