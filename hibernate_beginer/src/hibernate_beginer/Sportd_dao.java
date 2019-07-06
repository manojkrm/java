package hibernate_beginer;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Sportd_dao {
	
	public Sportd_dao(){
		
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	public void insertssports(Sports_dto dto) {
		
		Configuration  cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Sports_dto.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		session.save(dto);
		tx.commit();
/*		sysout
*/		
		
		

	}

}
