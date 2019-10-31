package hibernate.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class Dealer 
{
	@Autowired
	public Repo repo;
	public void addStock(String sname,Long scon)
	{
		Brand b1=new Brand("Nokia6.1Plus",50,14500.4);
		Brand b2=new Brand("Honor9I",10,7500.10);
		Brand b3=new Brand("RedmiNote5Pro",70,8999.9);
		Brand b4=new Brand("SamsungS7",7,27800.4);
		Shop s1=new Shop(sname,scon);
		s1.getBrands().add(b1);s1.getBrands().add(b2);
		s1.getBrands().add(b3);s1.getBrands().add(b4);
		repo.save(s1);
		System.out.println("Shop and brands added successfully");
	}
}
