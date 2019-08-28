package daytwo.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DefinitionInheritance 
{
	public static void main(String[] args) 
	{
		AbstractApplicationContext cont=new ClassPathXmlApplicationContext("daytwo.xml");
		cont.registerShutdownHook();
		/*Voter vote=(Voter)cont.getBean("voter1");System.out.println(vote);
		vote=(Voter)cont.getBean("voter2");System.out.println(vote);
		vote=(Voter)cont.getBean("voter3");System.out.println(vote);
		vote=(Voter)cont.getBean("voter4");System.out.println(vote);*/
		Section sec=(Section)cont.getBean("section");
		System.out.println(sec);
	}
}
