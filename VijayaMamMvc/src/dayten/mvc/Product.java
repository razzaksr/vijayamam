package dayten.mvc;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product 
{
	@Pattern(regexp="[^0-9]*")
	@Size(max=10, min=5)
	private String name;
	@Future
	private Date expiry;
	private Double price;
	@Max(30)
	@Min(10)
	private Integer qty;
	private Long id;
	public Product() {}
	@Override
	public String toString() {
		return "Product [name=" + name + ", expiry=" + expiry + ", price="
				+ price + ", qty=" + qty + ", id=" + id + "]";
	}
	public Product(String name, Date expiry, double price, int qty, long id) {
		super();
		this.name = name;
		this.expiry = expiry;
		this.price = price;
		this.qty = qty;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
