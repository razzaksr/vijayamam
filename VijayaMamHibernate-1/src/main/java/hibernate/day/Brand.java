package hibernate.day;

import javax.persistence.Embeddable;

@Embeddable
public class Brand 
{
	private String bname;
	private Integer qty;
	private Double price;
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Brand(String bname, Integer qty, Double price) {
		super();
		this.bname = bname;
		this.qty = qty;
		this.price = price;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Brand [bname=" + bname + ", qty=" + qty + ", price=" + price + "]";
	}
}
