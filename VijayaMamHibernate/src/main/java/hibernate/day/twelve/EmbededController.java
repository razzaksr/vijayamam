package hibernate.day.twelve;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmbededController 
{
	@Autowired
	PersonRemote remote;
	
	@GetMapping("/one")
	public ModelAndView first()
	{
		return new ModelAndView("init");
	}
	
	@PostMapping("/done")
	public ModelAndView second(Org org)
	{
		remote.save(org);
		return new ModelAndView("initiated").addObject("object",org);
	}
}