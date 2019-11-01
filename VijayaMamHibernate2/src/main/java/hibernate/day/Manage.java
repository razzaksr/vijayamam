package hibernate.day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manage 
{
	@Autowired
	RepoInher repo;
	public void testSingleTable()
	{
		Resource res=new Resource("Mohamed",7,7000);
		Training train=new Training("Vignan", 13);train.setResName("Vijaya");
		train.setResExp(10);train.setResPay(7000);
		Development dev=new Development("C",4);dev.setResName("Murali");dev.setResExp(3);
		dev.setResPay(4000);
		repo.save(res);repo.save(train);repo.save(dev);
	}
	public void testTablePerClass()
	{
		Resource res=new Resource("Mohamed",7,7000);
		Training train=new Training("Vignan", 13);train.setResName("Vijaya");
		train.setResExp(10);train.setResPay(7000);
		Development dev=new Development("C",4);dev.setResName("Murali");dev.setResExp(3);
		dev.setResPay(4000);
		repo.save(res);repo.save(train);repo.save(dev);
	}
	public void testJoinTable()
	{
		Resource res=new Resource("Mohamed",7,7000);
		Training train=new Training("Vignan", 13);train.setResName("Vijaya");
		train.setResExp(10);train.setResPay(7000);
		Development dev=new Development("C",4);dev.setResName("Murali");dev.setResExp(3);
		dev.setResPay(4000);
		repo.save(res);repo.save(train);repo.save(dev);
	}
}
