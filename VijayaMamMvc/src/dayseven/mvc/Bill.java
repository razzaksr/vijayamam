package dayseven.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bill 
{
	private int id;
	private double cost;
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Autowired
	private Furniture furniture;
	public Bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bill(int id, Furniture furniture) {
		super();
		this.id = id;
		this.furniture = furniture;
	}
	@Override
	public String toString() {
		return "Bill [id=" + id + ", cost=" + cost + ", furniture=" + furniture
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Furniture getFurniture() {
		return furniture;
	}
	public void setFurniture(Furniture furniture) {
		this.furniture = furniture;
	}
}
