package hibernate.day;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Machine 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int macId;
	private String macModel;
	private double macPrice;
	@Override
	public String toString() {
		return "Machine [macId=" + macId + ", macModel=" + macModel + ", macPrice=" + macPrice + "]\n";
	}
	public Machine(String macModel, double macPrice) {
		super();
		this.macModel = macModel;
		this.macPrice = macPrice;
	}
	public Machine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMacId() {
		return macId;
	}
	public void setMacId(int macId) {
		this.macId = macId;
	}
	public String getMacModel() {
		return macModel;
	}
	public void setMacModel(String macModel) {
		this.macModel = macModel;
	}
	public double getMacPrice() {
		return macPrice;
	}
	public void setMacPrice(double macPrice) {
		this.macPrice = macPrice;
	}
}
