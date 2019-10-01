package dayeight.mvc;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/course")
public class CourceController
{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate=new JdbcTemplate(this.dataSource);
	}
	@ModelAttribute
	public void someHow(Model mod)
	{
		mod.addAttribute("org", "Zealous");
	}
	@InitBinder
	public void act(WebDataBinder web)
	{
		SimpleDateFormat simple=new SimpleDateFormat("dd#MM#yyyy");
		web.registerCustomEditor(Date.class, "date",new CustomDateEditor(simple,false));
		web.registerCustomEditor(String.class, "name",new VijayaEditor());
	}
	@RequestMapping("/enter")
	public ModelAndView enter()
	{
		return new ModelAndView("enroll");
	}
	@RequestMapping(value="/entered",method=RequestMethod.POST)
	public ModelAndView entered(@ModelAttribute("course") Course course)
	{
		jdbcTemplate.update("insert into mvc(name,date,price) values(?,?,?)", new Object[]{course.getName(),course.getDate(),course.getPrice()});
		return new ModelAndView("enrolled").addObject("obj", course);
	}
}