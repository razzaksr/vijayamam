package hibernate.day.thirteen;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Kart 
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int kid;
	private String owner;
	private int sum;
	
	/* //one to one mapping related 
	 * @OneToOne private Product product; public Kart( String owner, Product
	 * product) { super(); this.owner = owner; this.product = product; } public
	 * Product getProduct() { return product; }
	 * 
	 * public void setProduct(Product product) { this.product = product; }
	 * 
	 * @Override public String toString() { return "Kart [kid=" + kid + ", owner=" +
	 * owner + ", sum=" + sum + ", product=" + product + "]"; }
	 */
	
	/*
	 * // one to many
	 * 
	 * @OneToMany
	 * 
	 * @JoinTable(name="KNP", joinColumns = @JoinColumn(name="KartId"),
	 * inverseJoinColumns = @JoinColumn(name="ProId")) private Collection<Product>
	 * pros=new ArrayList<Product>(); public Collection<Product> getPros() { return
	 * pros; }
	 * 
	 * public void setPros(Collection<Product> pros) { this.pros = pros; } public
	 * Kart(String owner, Collection<Product> pros) { super(); this.owner = owner;
	 * this.pros = pros; }
	 * 
	 * 
	 * 
	 * public Kart(String owner) { super(); this.owner = owner; }
	 * 
	 * @Override public String toString() { return "Kart [kid=" + kid + ", owner=" +
	 * owner + ", sum=" + sum + ", pros=" + pros + "]"; }
	 * 
	 */	
	
	@ManyToMany
	private Collection<Product> huge=new ArrayList<Product>();
	
	public Collection<Product> getHuge() {
		return huge;
	}
	public void setHuge(Collection<Product> huge) {
		this.huge = huge;
	}
	public Kart(String owner) { super(); this.owner = owner; }
	public Kart() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	

	public int getKid() {
		return kid;
	}

	public void setKid(int kid) {
		this.kid = kid;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	 
}
