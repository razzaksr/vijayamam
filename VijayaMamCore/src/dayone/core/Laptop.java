package dayone.core;

public class Laptop 
{
	private String model;private Integer ram, hdd;private Double price;
	public Laptop(){}
	public Laptop(String a, Integer b, Integer c, Double d)
	{
		this.model=a;this.ram=b;this.hdd=c;this.price=d;
	}
	public Laptop(Integer b, Double d, String a, Integer c)
	{
		this.model=a;this.ram=b;this.hdd=c;this.price=d;
	}
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getHdd() {
		return hdd;
	}

	public void setHdd(Integer hdd) {
		this.hdd = hdd;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	public String toString(){return model+" "+ram+" "+hdd+" "+price+"\n";}
}
