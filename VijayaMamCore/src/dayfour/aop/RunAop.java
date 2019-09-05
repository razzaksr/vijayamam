package dayfour.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunAop 
{
	public static void main(String[] args) 
	{
		ApplicationContext cont=new ClassPathXmlApplicationContext("aop.xml");
		College col=(College)cont.getBean("college");
		System.out.println(col.getCamp().getHired());
		System.out.println(col.getCamp().getRole());
		//System.out.println(col.getEve().getName()+" "+col.getEve().getPrice());
		System.out.println(col);
		/*Campus ca=new Campus();ca.setName("Cognizant"); 
		col.setCamp(ca);System.out.println(col.getCamp().getName());*/
		
	}
}
