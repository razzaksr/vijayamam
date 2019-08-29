package daythree.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller
{
	public static void main(String[] args) 
	{
		ApplicationContext cont=new ClassPathXmlApplicationContext("daythree.xml");
		Operate op=(Operate)cont.getBean("dlithe");
		op.list();
		op=(Operate)cont.getBean("smart");op.list();
		/*Smart s=(Smart)cont.getBean("smart");
		s.list();s.update(cont.getBean("free5"));
		System.out.println(s.read(0));
		s.delete(1);s.list();*/
		/*Dlithe d=(Dlithe)cont.getBean("dlithe");
		d.list();
		System.out.println(d.read(2));d.delete(1);
		d.list();Freelancer f=(Freelancer)cont.getBean("free4");
		d.update(f);d.list();*/
	}
}
