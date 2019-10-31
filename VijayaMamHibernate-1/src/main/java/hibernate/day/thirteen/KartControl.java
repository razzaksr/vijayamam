package hibernate.day.thirteen;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KartControl {
	@Autowired
	public RepoKart repo;
	@Autowired
	public RepoProduct repro;
	public void crud()
	{
		/*
		 * Product p1=new Product("Live-O", 12);// transient // create/ insert
		 * repro.save(p1);// persist
		 */		
		
		//read
		Optional<Product> pro=repro.findById(20);
		System.out.println("Fetched product: "+pro);
		
		Product pro1=repro.findByPname("HDD Case");
		System.out.println("Fetched product by name: "+pro1);
		
		/*
		 * //update pro1.setPrice(800); repro.save(pro1);
		 */
		
		//deleted
		repro.delete(repro.findByPname("Surf"));
		System.out.println("Deleted");
	}
	/*
	 * public void testOneToOne() { Product pro1=new Product("Milkymist", 30); Kart
	 * k1=new Kart("VijayaMam",pro1); k1.setSum(pro1.getPrice());
	 * repro.save(pro1);repo.save(k1);
	 * System.out.println("Product added in the kart"); }
	 */
	/*
	 * public void testOneToMany() { Product p2=new Product("ArunColorBar", 35);
	 * Product p3=new Product("Paneer", 60); Product p1=new Product("Apple", 123);
	 * Product p4=new Product("Carrot", 67); Kart k1=new Kart("Mohamed");
	 * k1.getPros().add(p1);k1.getPros().add(p2);k1.getPros().add(p3);k1.getPros().
	 * add(p4); k1.setSum(p1.getPrice()+p2.getPrice()+p3.getPrice()+p4.getPrice());
	 * repro.save(p1);repro.save(p2);repro.save(p3);repro.save(p4); repo.save(k1);
	 * System.out.println(k1.getOwner()+" has bill of "+k1.getSum()); }
	 */
	/*
	 * public void testManyToOne() { Product p2=new Product("Fanta", 120); Product
	 * p3=new Product("Surf", 400); Product p1=new Product("Cinthol",320); Product
	 * p4=new Product("Himalaya", 100); Kart k1=new
	 * Kart("Sabari");k1.setSum(p1.getPrice()+p2.getPrice()+p3.getPrice()+p4.
	 * getPrice()); p1.setKart(k1);p2.setKart(k1);p3.setKart(k1);p4.setKart(k1);
	 * repo.save(k1);repro.save(p1);repro.save(p2);repro.save(p3);repro.save(p4);
	 * System.out.println(k1.getOwner()+" has bill of "+k1.getSum());
	 * 
	 * Product p2=new Product("Bata", 578); Product p3=new Product("Raybon", 120);
	 * Product p1=new Product("Adidas", 900); Product p4=new
	 * Product("ZebronicsPendrive", 460);
	 * repro.save(p1);repro.save(p2);repro.save(p3);repro.save(p4);
	 * ArrayList<Product> temp=new ArrayList<Product>();
	 * temp.add(p1);temp.add(p2);temp.add(p3);temp.add(p4); Kart k1=new
	 * Kart("Razak",temp);
	 * p1.setKart(k1);p2.setKart(k1);p3.setKart(k1);p4.setKart(k1);
	 * k1.setSum(p1.getPrice()+p2.getPrice()+p3.getPrice()+p4.getPrice());
	 * repo.save(k1); System.out.println(k1.getOwner()+" has bill of "+k1.getSum());
	 * 
	 * }
	 */
	/*
	 * public void testManyToMany() { Product p2=new Product("LaptopBackPack", 578);
	 * Product p3=new Product("Gorilla Glass", 120); Product p1=new
	 * Product("Bluetooth Headset", 900); Product p4=new Product("HDD Case", 460);
	 * Kart k1=new Kart("Sheik");Kart k2=new Kart("Vikas");Kart k3=new
	 * Kart("Murali"); repo.save(k1);repo.save(k2);repo.save(k3);
	 * repro.save(p1);repro.save(p2);repro.save(p3);repro.save(p4);
	 * ArrayList<Product> tempPro=new
	 * ArrayList<Product>();tempPro.add(p1);tempPro.add(p2);tempPro.add(p3);tempPro.
	 * add(p4); k1.setHuge(tempPro);k2.setHuge(tempPro);k3.setHuge(tempPro);
	 * p1.getSome().add(k1);p2.getSome().add(k2);p3.getSome().add(k3);p4.getSome().
	 * add(k2);
	 * 
	 * System.out.println("Many to many done"); }
	 */
}