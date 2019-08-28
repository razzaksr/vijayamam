package daytwo.core;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Voter //implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean
{
	private String name, address, beanName;private int age;
	public Voter(){}
	public Voter(String a,String b, int c)
	{name=a;address=b;age=c;}
	public String toString()
	{
		//if(beanName.equals("voter1")||beanName.equals("voter4")||beanName.equals("voter3"))
		{return name+" "+address+" "+age+"\n";}
		/*else if(beanName.equals("voter3"))
		{return name+" "+address+"\n";}*/
		/*else if(beanName.equals("voter2"))
		{return address+" "+age+"\n";}*/
		//return "";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*public void setAge(String age) {
		this.age=Integer.parseInt(age);
	}*/
	/*@Override
	public void setBeanName(String arg0) 
	{
		beanName=arg0;System.out.println(beanName);
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		System.out.println("Authority starts to verifying voter details: "+arg0);
	}
	@Override
	public void destroy() throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println(beanName+" destroyed from scope");
	}
	@Override
	public void afterPropertiesSet() throws Exception 
	{
		// TODO Auto-generated method stub
		System.out.println(beanName+" setted their properties");
	}*/
}
