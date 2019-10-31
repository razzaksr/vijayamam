package hibernate.day.thirteen;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String pname;
	private int price;

	/*
	 * @ManyToOne(fetch = FetchType.LAZY, optional = false) private Kart kart;
	 * public Kart getKart() { return kart; } public void setKart(Kart kart) {
	 * this.kart = kart; }
	 */
	/*
	 * @ManyToMany(mappedBy = "huge") private Collection<Kart> some=new
	 * ArrayList<Kart>(); public Collection<Kart> getSome() { return some; } public
	 * void setSome(Collection<Kart> some) { this.some = some; }
	 */
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	
}
