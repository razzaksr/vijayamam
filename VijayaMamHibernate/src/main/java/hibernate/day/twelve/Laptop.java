package hibernate.day.twelve;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Laptop
{
	/*
	 * @Id @GeneratedValue(strategy = GenerationType.AUTO) private Integer id;
	 */
	private String model;
	private Integer ram;

	/*
	 * public Integer getId() { return id; } public void setId(Integer id) { this.id
	 * = id; }
	 */
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getRam() {
		return ram;
	}
	public void setRam(Integer ram) {
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Laptop [model=" + model + ", ram=" + ram + "]";
	}
}
