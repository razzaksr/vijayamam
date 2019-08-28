package dayone.core;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class LapRetail 
{
	public static void main(String[] args) 
	{
		//BeanFactory fact=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext fact=new ClassPathXmlApplicationContext("apcontext.xml");
		Laptop lap=(Laptop)fact.getBean("lap1");System.out.println(lap);
		lap=(Laptop)fact.getBean("lap2");System.out.println(lap);
		lap=(Laptop)fact.getBean("lap3");System.out.println(lap);
	}
}