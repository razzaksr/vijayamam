package hibernate.day;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/razak")
public class Razak 
{
	@Autowired
	LapRepository repo;
	@RequestMapping("/")
	public ModelAndView index()
	{
		List<Machine> all=new ArrayList<Machine>();
		repo.findAll().forEach(all::add);
		return new ModelAndView("list").addObject("every", all);
	}
	
	@RequestMapping("/create")
	public ModelAndView add()
	{
		return new ModelAndView("create");
	}
	
	@RequestMapping(value="/created", method=RequestMethod.POST)
	public ModelAndView added(Machine machine)
	{
		repo.save(machine);
		return new ModelAndView("created").addObject("newone", machine);
	}
	
	@RequestMapping("/reach")
	public ModelAndView read()
	{
		return new ModelAndView("readById");
	}
	
	@RequestMapping(value="/reached", method=RequestMethod.POST)
	public ModelAndView readed(@RequestParam("id") int id)
	{
		Machine ma=repo.findById(id).orElse(new Machine());
		return new ModelAndView("fetched").addObject("got", ma);
	}
	
	@RequestMapping("/range")
	public ModelAndView readRange()
	{
		return new ModelAndView("readByRange");
	}
	
	@RequestMapping(value="/reachedprice", method=RequestMethod.POST)
	public ModelAndView readedRange(@RequestParam("price1") double price1, @RequestParam("price2") double price2)
	{
		List<Machine> ma=new ArrayList<Machine>();
		repo.findByBetween(price1,price2).forEach(ma::add);
		return new ModelAndView("fetched").addObject("got", ma);
	}
	
	@RequestMapping("/change")
	public ModelAndView update()
	{
		return new ModelAndView("update");
	}
	
	@RequestMapping(value="/tryupdate", method=RequestMethod.POST)
	public ModelAndView tryup(@RequestParam("id") int id)
	{
		Machine ma=repo.getOne(id);
		return new ModelAndView("tryup").addObject("updata", ma);
	}
	
	@RequestMapping(value="/changed", method=RequestMethod.POST)
	public ModelAndView updated(Machine machine)
	{
		repo.save(machine);
		return new ModelAndView("updated").addObject("changed", machine);
	}
	
	@RequestMapping("/remove")
	public ModelAndView delete()
	{
		return new ModelAndView("delete");
	}
	
	@RequestMapping(value="/removed", method=RequestMethod.POST)
	public ModelAndView deleted(@RequestParam("id") int id)
	{
		Machine ma=repo.getOne(id);
		repo.delete(ma);
		return new ModelAndView("deleted").addObject("deleted", ma);
	}
}
