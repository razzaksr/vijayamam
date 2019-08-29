package daythree.core;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Annots 
{
	//@Autowired
	private Freelancer lancer1,lancer2;
	public Annots(){}
	public String toString(){return lancer1.toString()+" "+lancer2.toString()+"\n";}
	
	@PostConstruct
	public void init(){System.out.println("Recruitement stated");}
	@PreDestroy
	public void destroy(){System.out.println("Recruitement over");}

	public Freelancer getLancer2() {
		return lancer2;
	}
	
	@Autowired
	//@Qualifier("freelance2")
	@Resource(name="free2")
	public void setLancer2(Freelancer lancer2) {
		this.lancer2 = lancer2;
	}

	public Freelancer getLancer1() {
		return lancer1;
	}
	
	@Autowired
	//@Qualifier("freelance1")
	@Resource(name="free1")
	public void setLancer1(Freelancer lancer1) {
		this.lancer1 = lancer1;
	}
}
