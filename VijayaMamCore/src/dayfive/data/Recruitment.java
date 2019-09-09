package dayfive.data;

public class Recruitment 
{
	private int day;
	private String org, skill;
	private double lpa;
	public Recruitment(){}
	public Recruitment(String a, String b, double c)
	{org=a;skill=b;lpa=c;}
	public String toString(){return day+" "+org+" "+skill+" "+lpa+"\n";}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public double getLpa() {
		return lpa;
	}
	public void setLpa(double lpa) {
		this.lpa = lpa;
	}
}
