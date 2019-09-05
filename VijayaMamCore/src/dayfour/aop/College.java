package dayfour.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College 
{
	@Autowired
	private Campus camp;
	@Autowired
	private Event eve;
	public Campus getCamp() {
		return camp;
	}
	public void setCamp(Campus camp) {
		this.camp = camp;
	}
	public Event getEve() {
		return eve;
	}
	public void setEve(Event eve) {
		this.eve = eve;
	}
	public String toString(){return camp.getName()+" "+eve.getName()+"\n";}
}
