package client;

import org.hibernate.Session;

import connection.SSconnection;
import entity.Cart;
import entity.Item;

public class BidirectionalMapping {
	
	public static void main(String[] args) {
//		Item item = new Item("asdfgh",123456.00d,1);
//	    Cart cart = new Cart(1d, "Iphone 14pro max",item);
		Session openSess = SSconnection.openSess();
		openSess.getTransaction().begin();
//	    openSess.persist(cart);
//		openSess.save(item);
		Cart cart2 = openSess.get(Cart.class, 1l);
		System.out.println(cart2.getId());
		System.out.println(cart2.getName());
		System.out.println(cart2.getTotal());
		System.out.println(cart2.getItem().getItemId());
		System.out.println(cart2.getItem().getQuantity());
		System.out.println(cart2.getItem().getItemTotal());
//		openSess.getTransaction().commit();
		SSconnection.closes();
		

	}

}
