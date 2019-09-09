package dayfive.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataPart1 
{
	public static void main(String[] args) 
	{
		ApplicationContext app=new ClassPathXmlApplicationContext("spring-data.xml");
		DataActions action=(DataActions)app.getBean("dataActions");
		//action.createTable();
		//action.insert(new Recruitment("Google", "AI", 5.5));
		//System.out.println(action.getRowStatus());
		//System.out.println(action.getCompany(3));
		//System.out.println(action.getCompanies(4.0, 7.2));
		//System.out.println(action.getCAll());
		//System.out.println(action.getOne("Paypal"));
		System.out.println(action.deleteReq(4));
	}
}
