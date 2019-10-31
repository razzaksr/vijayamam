package hibernate.day;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import hibernate.day.thirteen.KartControl;

@SpringBootApplication
public class VijayaMamHibernate1Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(VijayaMamHibernate1Application.class, args);
		/* // elements collection refer hibernate.day package classes
		 * Dealer deal=(Dealer)context.getBean("dealer"); deal.addStock("Poorvika",
		 * 9876545678L);
		 */
		
		/*
		 * // one to one execution KartControl
		 * control=(KartControl)context.getBean("kartControl"); control.testOneToOne();
		 */
		
		/*
		 * // one to many execution KartControl
		 * control=(KartControl)context.getBean("kartControl"); control.testOneToMany();
		 */
		
		/*
		 * // many to one execution KartControl
		 * control=(KartControl)context.getBean("kartControl"); control.testManyToOne();
		 */
		
		/*
		 * // many to many execution KartControl
		 * control=(KartControl)context.getBean("kartControl");
		 * control.testManyToMany();
		 */
		
		// crud calling
		KartControl control=(KartControl)context.getBean("kartControl");
		control.crud();
	}
}
