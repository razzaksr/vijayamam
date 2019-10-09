package hibernate.day.eleven;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// model class
@Entity
//@Table(name = "stocs")
public class Laptop 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer lapId;
	private String lapModel;
	private int lapRam;
	private int lapHdd;
	private double lapAmt;
	@Override
	public String toString() {
		return "Laptop [lapId=" + lapId + ", lapModel=" + lapModel + ", lapRam=" + lapRam + ", lapHdd=" + lapHdd
				+ ", lapAmt=" + lapAmt + "]";
	}
	public Integer getLapId() {
		return lapId;
	}
	public void setLapId(Integer lapId) {
		this.lapId = lapId;
	}
	public String getLapModel() {
		return lapModel;
	}
	public void setLapModel(String lapModel) {
		this.lapModel = lapModel;
	}
	public int getLapRam() {
		return lapRam;
	}
	public void setLapRam(int lapRam) {
		this.lapRam = lapRam;
	}
	public int getLapHdd() {
		return lapHdd;
	}
	public void setLapHdd(int lapHdd) {
		this.lapHdd = lapHdd;
	}
	public double getLapAmt() {
		return lapAmt;
	}
	public void setLapAmt(double lapAmt) {
		this.lapAmt = lapAmt;
	}
}
