package daythree.core;

public class Freelancer 
{
	private String name, skill;private int exp, perday;
	public Freelancer(){}
	public Freelancer(String a, String b, int c,int d)
	{name=a;skill=b;exp=c;perday=d;}
	public String toString()
	{return name+" "+skill+" "+exp+" "+perday+"\n";}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public int getPerday() {
		return perday;
	}
	public void setPerday(int perday) {
		this.perday = perday;
	}
}
