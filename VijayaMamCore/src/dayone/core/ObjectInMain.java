package dayone.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectInMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext cont=new ClassPathXmlApplicationContext("apcontext.xml");
		Dealer d=(Dealer)cont.getBean("retail");
		System.out.println(d);
	}
}