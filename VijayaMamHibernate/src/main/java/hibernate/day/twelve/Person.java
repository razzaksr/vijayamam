package hibernate.day.twelve;

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
@Embeddable
public class Person implements Serializable
{
	//@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	private String name;
	private Integer exp;
	@Embedded
	private Laptop laptop;
	@Embedded
	@AttributeOverrides
	(
			{
				@AttributeOverride(name="model",column = @Column(name = "laptop1model")),
				@AttributeOverride(name="ram",column = @Column(name = "laptop1ram"))
			}
	)
	private Laptop laptop1;
	public Laptop getLaptop1() {
		return laptop1;
	}
	public void setLaptop1(Laptop laptop1) {
		this.laptop1 = laptop1;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getExp() {
		return exp;
	}
	public void setExp(Integer exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", exp=" + exp + ", laptop=" + laptop + "]";
	}
}
