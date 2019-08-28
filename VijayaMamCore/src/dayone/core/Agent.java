package dayone.core;

import java.util.Iterator;
import java.util.Set;

public class Agent 
{
	private String brand;
	private Set<Laptop> items;
	public Agent(){}
	public Agent(String a,Set<Laptop> b)
	{brand=a;items=b;}
	public String toString()
	{
		String temp=brand+"\n";
		Iterator<Laptop> it=items.iterator();
		while(it.hasNext())
		{
			temp+=it.next()+"\n";
		}
		return temp;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Set<Laptop> getItems() {
		return items;
	}
	public void setItems(Set<Laptop> items) {
		this.items = items;
	}
}
