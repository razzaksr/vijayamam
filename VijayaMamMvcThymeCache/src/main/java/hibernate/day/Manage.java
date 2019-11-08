package hibernate.day;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Manage 
{
	@Autowired
	Repositor repo;
	@RequestMapping("/")
	public ModelAndView begin()
	{
		Machine mac=repo.getOne(2);
		System.out.println(mac);
		return new ModelAndView("list.html").addObject("m", mac);
	}
	
	@RequestMapping("/all")
	public ModelAndView show()
	{
		List<Machine> mac=new ArrayList<Machine>();
		repo.findAll().forEach(mac::add);
		return new ModelAndView("show").addObject("m", mac);
	}
}
