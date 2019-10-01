package dayeight.mvc;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Course 
{
	private String name;
	private Date date;
	private int price;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String name, Date date, Integer price) {
		super();
		this.name = name;
		this.date = date;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [name=" + name + ", date=" + date + ", price=" + price
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
}
