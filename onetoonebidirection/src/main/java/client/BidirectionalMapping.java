package client;

import org.hibernate.Session;

import connection.SSconnection;
import entity.AddtoCart;
import entity.Flipkart;
 

public class BidirectionalMapping {
	public static void main(String[] args) {
//     Flipkart flipkart = new Flipkart("iphone", "Apple");
//     AddtoCart a1 = new AddtoCart("redmi", 3200.00, 1, flipkart);
		Session openSess = SSconnection.openSess();
//		openSess.save(a1);
//		openSess.save(flipkart);
		openSess.getTransaction().begin();
		openSess.getTransaction().commit();
		SSconnection.closes();
	}

}
