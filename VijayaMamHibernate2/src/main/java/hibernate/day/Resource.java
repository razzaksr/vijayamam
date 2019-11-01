package hibernate.day;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
/*
 * // Single table
 * 
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * 
 * @DiscriminatorColumn(name="industry",discriminatorType =
 * DiscriminatorType.STRING)
 */
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // table per class
@Inheritance(strategy = InheritanceType.JOINED) // join table
public class Resource 
{
	//@Id @GeneratedValue(strategy = GenerationType.AUTO)// single table
	@Id @GeneratedValue(strategy = GenerationType.TABLE)
	private int resId;
	private String resName;
	private int resExp;
	private int resPay;
	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Resource(String resName, int resExp, int resPay) {
		super();
		this.resName = resName;
		this.resExp = resExp;
		this.resPay = resPay;
	}
	public int getResId() {
		return resId;
	}
	public void setResId(int resId) {
		this.resId = resId;
	}
	public String getResName() {
		return resName;
	}
	public void setResName(String resName) {
		this.resName = resName;
	}
	public int getResExp() {
		return resExp;
	}
	public void setResExp(int resExp) {
		this.resExp = resExp;
	}
	public int getResPay() {
		return resPay;
	}
	public void setResPay(int resPay) {
		this.resPay = resPay;
	}
}
