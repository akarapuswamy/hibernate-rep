package test;



import org.hibernate.Session;

import connection.SSconnection;
import util.CricketPlayer;
import util.FoodBall;
import util.Player;

public class Test {
	
	public static void main(String[] args) {
		Session sess = SSconnection.openSess();
		Player player = new Player("bolt", "atheletic");
		CricketPlayer ck = new CricketPlayer("sachin", "Short man", "india", "batsman");
		FoodBall f1 = new FoodBall("swamy", "musclur", 1200, "bn reddy");
		sess.getTransaction().begin();
		sess.persist(player);
		sess.persist(ck);
		sess.persist(f1);
		sess.getTransaction().commit();
		SSconnection.closes();		
}
}