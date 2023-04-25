package test;


import java.util.List;

import org.hibernate.Session;

import connection.SSconnection;
import util.CricketPlayer;

import util.FoodBoll;
import util.Player;

public class Test {
	
	public static void main(String[] args) {
		Session sess = SSconnection.openSess();
//		Player player = new Player("boltqwer", "atheleticqwer");
//		CricketPlayer ck = new CricketPlayer("qwertyuio", "Shorsdfght man", "indiawerty", "baqqwwewwtsman");
//		FoodBoll f1 = new FoodBoll ("ssdfghjky", "msdfghjr", 120000, "bn ddddreddy");
			sess.getTransaction().begin();
//			sess.persist(player);
//			sess.persist(ck);
//			sess.persist(f1);
			sess.getTransaction().commit();
			List<Player> list = sess.createQuery(" from FoodBoll ").list();
			for (Player player2 : list) {
				System.out.println(player2);
			}
						SSconnection.closes();
}
}