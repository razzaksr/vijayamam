package hibernate.day;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("assignment") // only for single table
public class Training extends Resource
{
	private String collegeName;
	private int days;
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training(String resName, int resExp, int resPay) {
		super(resName, resExp, resPay);
		// TODO Auto-generated constructor stub
	}
	public Training(String collegeName, int days) {
		super();
		this.collegeName = collegeName;
		this.days = days;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
}
