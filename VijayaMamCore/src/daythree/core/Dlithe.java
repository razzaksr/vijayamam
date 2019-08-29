package daythree.core;

import org.springframework.beans.factory.annotation.Required;

public class Dlithe implements Operate 
{
	private Freelancer[] dfree=new Freelancer[4];
	public Dlithe(){}
	public Dlithe(Freelancer[] h)
	{dfree=h;}

	public Freelancer[] getDfree() {
		return dfree;
	}
	//@Required
	public void setDfree(Freelancer[] dfree) {
		this.dfree = dfree;
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		for(int ind=0;ind<dfree.length;ind++)
		{if(dfree[ind]==null)
		{dfree[ind]=(Freelancer)obj;System.out.println(dfree[ind].getName()+" added in dlithe");break;}
		}
	}

	@Override
	public Object read(int index) {
		// TODO Auto-generated method stub
		if(index>=dfree.length)
		{System.out.println("Out of range");return null;}
		else{
		return (Object)dfree[index];}
	}

	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		if(index>=dfree.length)
		{System.out.println("Out of range");return;}
		else{System.out.println(dfree[index].getName()+" gonna sack from dlithe");dfree[index]=null;}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		for(Freelancer temp:dfree){System.out.println(temp);}
	}
}