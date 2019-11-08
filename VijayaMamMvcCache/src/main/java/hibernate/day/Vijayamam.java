package hibernate.day;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Vijayamam 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int day;
	private String org, skill;
	private double lpa;
	@Override
	public String toString() {
		return "Vijayamam [day=" + day + ", org=" + org + ", skill=" + skill + ", lpa=" + lpa + "]";
	}
	public Vijayamam() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vijayamam(String org, String skill, double lpa) {
		super();
		this.org = org;
		this.skill = skill;
		this.lpa = lpa;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public double getLpa() {
		return lpa;
	}
	public void setLpa(double lpa) {
		this.lpa = lpa;
	}
}
