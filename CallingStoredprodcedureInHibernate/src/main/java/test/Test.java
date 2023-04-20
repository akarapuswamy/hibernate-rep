package test;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import connection.SSconnection;
import entities.Person;
import entities.Phone;
import entities.PhoneType;

public class Test {
	public static void main(String[] args) {
		Session session =null;
		try {
			session = SSconnection.openSess();
			session.beginTransaction();
			Person p1 = new Person();
			p1.setName("swamy");
			p1.setNickname("kapesh");
			p1.setAddress("turkayamal");
			p1.setCreateOn(new Date());
			p1.setVersion(1);
			
			Phone phone1 = new Phone();
			phone1.setNumber("9951280954");
			phone1.setType(PhoneType.MOBILE);
			phone1.setPerson(p1);
			
			p1.getPhone().add(phone1);
			
			
			
			Person p2 = new Person();
			p2.setName("raju");
			p2.setNickname("ranampally");
			p2.setAddress("bn reddy");
			p2.setCreateOn(new Date());
			p2.setVersion(1);
			
			Phone phone2 = new Phone();
			phone2.setNumber("9182824932");
			phone2.setType(PhoneType.LAND_LINE);
			phone2.setPerson(p2);
			
			Phone phone3 = new Phone();
			phone2.setNumber("9866051505");
			phone2.setType(PhoneType.LAND_LINE);
			phone2.setPerson(p2);
			
			p2.getPhone().add(phone1);
			p2.getPhone().add(phone3);
    
			session.save(p1);
			session.save(p2);
			
			session.getTransaction().commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();	
			}
		}	
	}	
}