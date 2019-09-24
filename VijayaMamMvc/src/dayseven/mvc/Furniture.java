package dayseven.mvc;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Furniture 
{
	private String name, material;
	private List<String> usage;
	public List<String> getUsage() {
		return usage;
	}

	public void setUsage(List<String> usage) {
		this.usage = usage;
	}
	private int price, qty;
	
	public Furniture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Furniture [name=" + name + ", material=" + material
				+ ", usage=" + usage + ", price=" + price + ", qty=" + qty
				+ "]";
	}

	public Furniture(String name, String material, List<String> usage,
			int price, int qty) {
		super();
		this.name = name;
		this.material = material;
		this.usage = usage;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
