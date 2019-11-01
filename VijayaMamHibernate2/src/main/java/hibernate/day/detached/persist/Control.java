package hibernate.day.detached.persist;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Control
{
	@Autowired
	RepoWater repo;
	public void testDetached()
	{
		WaterBottle bottle=new WaterBottle( "Kinley",1, 20);// transient
			repo.save(bottle);// persist
			bottle.setBottleCap(2);// detached
		repo.save(bottle);// persist
		Optional<WaterBottle> bot=repo.findById(1);
		System.out.println(bot);
	}
}
