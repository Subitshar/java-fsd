import org.hibernate.Session;


public class HibernateTest {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Product product1 = new Product("watch","1000"); 
		Product product2 = new Product("Phone","50000"); 
		Product product3 = new Product("Mouse","1000"); 
		Product product4 = new Product("Keyboard","5000"); 
		Product product5 = new Product("Laptop","100000"); 

		
		session.save(product1);
		session.save(product2);
		session.save(product3);
		session.save(product4);
		session.save(product5);
		
		
		session.getTransaction().commit();
		
		session.close();
		
	}
}