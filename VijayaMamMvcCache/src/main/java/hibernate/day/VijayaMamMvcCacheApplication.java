package hibernate.day;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VijayaMamMvcCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(VijayaMamMvcCacheApplication.class, args);
		SessionFactory fact=new Configuration().configure().buildSessionFactory();
		Session ses=fact.openSession();
		ses.beginTransaction();
		Vijayamam viji=ses.get(Vijayamam.class, 2);
		System.out.println(viji);
		ses.getTransaction().commit();
		ses.close();
		//viji.setSkill("Data Scientist");
		ses=fact.openSession();
		ses.beginTransaction();
		System.out.println(ses.get(Vijayamam.class, 2));
		ses.getTransaction().commit();
		ses.close();
	}

}
