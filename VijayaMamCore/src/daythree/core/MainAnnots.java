package daythree.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnots 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext cont=new ClassPathXmlApplicationContext("daythree.xml");
		cont.registerShutdownHook();
		Annots a=(Annots)cont.getBean("annots");
		System.out.println(a);
	}
}
