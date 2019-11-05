package hibernate.day;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import hibernate.day.detached.persist.Control;
import hibernate.day.hql.Dealer;

@SpringBootApplication
public class VijayaMamHibernate2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont=SpringApplication.run(VijayaMamHibernate2Application.class, args);
		//Manage man=(Manage)cont.getBean("manage");
		//man.testSingleTable();System.out.println("Inheritance done at single table");
		//man.testTablePerClass();System.out.println("Inheritance done at table per class");
		//man.testJoinTable();System.out.println("Inheritance done at join table");
		
		/*
		 * Control con=(Control)cont.getBean("control"); con.testDetached();
		 */
		
		Dealer deal=(Dealer)cont.getBean("dealer");
		//deal.list();
		//deal.testById();
		//deal.testByModel();
		//deal.testPriceByModel();
		//deal.testAllPrice();
		deal.testCriteriaNRestrictions();
	}

}
