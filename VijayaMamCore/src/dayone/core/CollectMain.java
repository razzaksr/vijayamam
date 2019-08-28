package dayone.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectMain 
{
	public static void main(String[] args) 
	{
		ApplicationContext cont=new ClassPathXmlApplicationContext("apcontext.xml");
		Agent d=(Agent)cont.getBean("agent");
		System.out.println(d);
	}
}
