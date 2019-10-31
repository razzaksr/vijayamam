package hibernate.day;

import java.util.Collection;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Shop 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sid;
	private String name;
	private Long contact;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shop(String name, Long contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="Stk_brd", joinColumns = @JoinColumn(name="StockId"))
	@GenericGenerator(name = "increment-gen", strategy = "increment")
	@CollectionId(columns = {@Column(name="BrandCount")}, generator = "increment-gen", type = @Type(type="int"))
	private Collection<Brand> brands=new ArrayList<Brand>();
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
		this.contact = contact;
	}
	public Collection<Brand> getBrands() {
		return brands;
	}
	public void setBrands(Collection<Brand> brands) {
		this.brands = brands;
	}
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", name=" + name + ", contact=" + contact + ", brands=" + brands + "]";
	}
}
