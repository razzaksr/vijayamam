package hibernate.day.eleven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/lap")
public class LaptopController 
{
	@Autowired
	LaptopRemote remote;
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView mod1()
	{
		return new ModelAndView("addStock");
	}
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	public ModelAndView mod2(Laptop laptop)
	{
		/*
		 * SessionFactory factory=new Configuration().buildSessionFactory(); Session
		 * session=factory.openSession(); session.beginTransaction();
		 * 
		 * session.save(laptop);//insert
		 * 
		 * session.getTransaction().commit(); session.close();
		 */
		remote.save(laptop);
		return new ModelAndView("addedStock").addObject("lap", laptop);
	}
}
