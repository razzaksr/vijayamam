package hibernate.day;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Some 
{
	@RequestMapping("/welcome")
	public String one()
	{
		return "welcome.jsp";
	}
	@RequestMapping(value="/redirect")
	public String two()
	{
		return "base.html";
	}
}
