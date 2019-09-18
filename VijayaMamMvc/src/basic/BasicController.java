package basic;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/basic")
public class BasicController 
{
	@RequestMapping("/hi")
	public ModelAndView alpha()
	{
		return new ModelAndView("index");
	}
	@RequestMapping("/hello/{model}/{price}")
	public ModelAndView beta(@PathVariable("model") String model,@PathVariable("price") int price)
	{
		System.out.println(model+" "+price);
		ModelAndView mod=new ModelAndView("index");
		mod.addObject("bikemodel", model);mod.addObject("bikeprice", price);
		return mod;
	}
	@RequestMapping(value="/heaven", method=RequestMethod.POST)
	public ModelAndView charge(@RequestParam Map<String, String> maps)
	{
		ModelAndView mod=new ModelAndView("second");
		System.out.println(maps.get("pay")+" "+maps.get("days"));
		int pay=Integer.parseInt(maps.get("pay"));int day=Integer.parseInt(maps.get("days"));
		int take=(day*pay)+(day*250);
		return mod.addObject("take", take);
	}
}
