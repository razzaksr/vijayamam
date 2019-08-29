package daythree.core;

import java.util.List;
import java.util.Vector;

public class Smart implements Operate
{
	private List<Freelancer> sfree=new Vector<Freelancer>();
	public Smart(){}
	public Smart(List<Freelancer> j)
	{sfree=j;}
	public List<Freelancer> getSfree() {
		return sfree;
	}
	public void setSfree(List<Freelancer> sfree) {
		this.sfree = sfree;
	}
	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		sfree.add((Freelancer)obj);System.out.println(obj+" added to smart");
	}
	@Override
	public Object read(int index) {
		// TODO Auto-generated method stub
		return (Object)sfree.get(index);
	}
	@Override
	public void delete(int index) {
		// TODO Auto-generated method stub
		System.out.println(sfree.get(index)+" going to remove");sfree.remove(index);
	}
	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println(sfree);
	}
}
