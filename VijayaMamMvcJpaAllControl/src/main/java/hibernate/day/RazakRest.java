package hibernate.day;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RazakRest 
{
	@Autowired
	LapRepository repo;
	@GetMapping("/")
	public List<Machine> every()
	{
		List<Machine> all=new ArrayList<Machine>();
		repo.findAll().forEach(all::add);
		return all;
	}
	@PostMapping("/post")
	public Machine posted(@RequestBody Machine machine)
	{
		repo.save(machine);
		return machine;
	}
	
	@GetMapping("/access")
	public Machine accessed(@RequestParam("id") int id)
	{
		Machine ma=repo.findById(id).orElse(new Machine());
		return ma;
	}
	
	@PutMapping("/alter")
	public Machine alter(@RequestBody Machine machine)
	{
		repo.save(machine);
		return  machine;
	}
	
	@DeleteMapping("/erase/{id}")
	public Machine erase(@PathVariable("id") int id)
	{
		Machine ma=repo.getOne(id);
		repo.delete(ma);
		return ma;
	}
}
