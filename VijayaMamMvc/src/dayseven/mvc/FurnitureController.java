package dayseven.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/furniture")
public class FurnitureController 
{
	@ModelAttribute
	public void some(Model mod)
	{
		mod.addAttribute("who", "Zealous Furnitures");
	}
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView newone(){return new ModelAndView("add");}
	@RequestMapping(value="/added",method=RequestMethod.POST)
	public ModelAndView addone(@ModelAttribute("bill") Bill bill, BindingResult bind)
	{
		if(bind.hasErrors()){return new ModelAndView("add");}
		bill.setCost(bill.getFurniture().getQty()*bill.getFurniture().getPrice());
		return new ModelAndView("added").addObject("newone", bill);
	}
}