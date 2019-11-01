package hibernate.day.detached.persist;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@org.hibernate.annotations.Entity(selectBeforeUpdate = true)
public class WaterBottle 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int bottleId;
	private String bottleBrand;
	private int bottleCap;
	private int bottlePrice;
	public WaterBottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "WaterBottle [bottleId=" + bottleId + ", bottleBrand=" + bottleBrand + ", bottleCap=" + bottleCap
				+ ", bottlePrice=" + bottlePrice + "]";
	}
	public WaterBottle(String bottleBrand, int bottleCap, int bottlePrice) {
		super();
		this.bottleBrand = bottleBrand;
		this.bottleCap = bottleCap;
		this.bottlePrice = bottlePrice;
	}
	public int getBottleId() {
		return bottleId;
	}
	public void setBottleId(int bottleId) {
		this.bottleId = bottleId;
	}
	public String getBottleBrand() {
		return bottleBrand;
	}
	public void setBottleBrand(String bottleBrand) {
		this.bottleBrand = bottleBrand;
	}
	public int getBottleCap() {
		return bottleCap;
	}
	public void setBottleCap(int bottleCap) {
		this.bottleCap = bottleCap;
	}
	public int getBottlePrice() {
		return bottlePrice;
	}
	public void setBottlePrice(int bottlePrice) {
		this.bottlePrice = bottlePrice;
	}
}
