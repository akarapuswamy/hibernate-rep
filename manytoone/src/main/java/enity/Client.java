package enity;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transaction;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import com.mysql.cj.xdevapi.SessionFactory;
import util.Sconnection;
public class Client {
	public static void main(String[] args) {
     Address address = new Address("turkayamjal", "telagana");
     Person p1 = new Person( "swamy", "akarapu", address);
        List<Person> p2 =new ArrayList<Person>();
        p2.add(new Person( "asdfg", "asdf", address));
        p2.add(new Person( "asdfg", "wertyuio", address));
        p2.add(new Person( "asdfg", "wertyuio", address));
        p2.add(new Person( "asdfg", "wertyuioikm", address));
	Session sess = Sconnection.openSess();
	sess.beginTransaction();
	for (Person person : p2) {
		sess.save(person);	
	}
	    sess.getTransaction().commit();
		System.out.println("successfully");	
	}
}