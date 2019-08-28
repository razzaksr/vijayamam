package dayone.core;

public class Dealer 
{
	private String brand;
	private Laptop lap1,lap2;
	public Dealer(){}
	public Dealer(String a, Laptop l1, Laptop l2)
	{
		this.brand=a;this.lap1=l1;this.lap2=l2;
	}
	public String toString(){return brand+" "+lap1+" "+lap2;}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Laptop getLap1() {
		return lap1;
	}
	public void setLap1(Laptop lap1) {
		this.lap1 = lap1;
	}
	public Laptop getLap2() {
		return lap2;
	}
	public void setLap2(Laptop lap2) {
		this.lap2 = lap2;
	}
}
