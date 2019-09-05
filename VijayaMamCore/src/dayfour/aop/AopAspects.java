package dayfour.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AopAspects 
{
	@Before("execution(public int getHired())")
	public void callDemo(JoinPoint join)
	{System.out.println("Requested to get information "+join.toString());}
	
	/*@Before("execution(public * get*())")
	public void always(){System.out.println("Invoked  when request anything");}*/
	
	@Before("forEvent()")
	public void onlyEvents(){System.out.println("Invoked by requesting Event information");}
	
	@Pointcut("within(dayfour.aop.Event)")
	public void forEvent(){}
	
	@After("args(params)")
	public void assignDemo(Object params)
	{System.out.println("Setted data: "+params);}
	
	@AfterReturning(pointcut="args(data)",returning="rdata")
	public void demoReturn(Object data,Object rdata){System.out.println(data+" Returning to same method "+rdata);}
	
	@Around("execution(public String toString())")
	public Object through(ProceedingJoinPoint proceed)
	{
		Object kind=null;
		try {
			System.out.println("Before proceeding happen");
			kind=(Object)proceed.proceed();
			System.out.println("After proceeding done");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return kind;
	}
	
	@Before("@annotation(vijayaaspect)")
	public void customAspect(JoinPoint join)
	{System.out.println("Vijaya aspect called: "+join.toString());}
}
