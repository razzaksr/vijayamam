package dayfive.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataPart2 
{
	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring-data.xml");
		//NamedDataActions action=(NamedDataActions)app.getBean("namedDataActions");
		//System.out.println(action.getFetch(5));
		//System.out.println(action.getFetch(4.5));
		//System.out.println(action.getFetch("Java"));
		DaoActions dao=(DaoActions)app.getBean("daoActions");
		System.out.println(dao.update(5, 8.5));
	}
}