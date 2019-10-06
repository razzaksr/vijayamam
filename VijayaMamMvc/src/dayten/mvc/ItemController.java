package dayten.mvc;

import java.util.InputMismatchException;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/pro")
public class ItemController 
{
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView mod1()
	{return new ModelAndView("reg");}
	@RequestMapping(value="/registered",method=RequestMethod.POST)
	public ModelAndView mod2(@Valid @ModelAttribute("product") Product product, BindingResult bind)throws Exception
	{
		System.out.println(product);
		if(product.getName().contains("Coke")||product.getName().contains("Pepsi")
	||product.getName().contains("Dairy")||product.getName().contains("Nestle"))
		{
			throw new ProductNotRequiredException();
		}
		else if(product.getPrice().isNaN())
		{
			throw new NumberFormatException();
		}
		else if(product.getId().toString().length()>=5)
		{
			throw new InputMismatchException();
		}
		if(bind.hasErrors()){return new ModelAndView("reg");}
		return new ModelAndView("done");
	}
}