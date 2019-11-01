package hibernate.day;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("project")  // only for single table
public class Development extends Resource
{
	private String skillSet;
	private int teamCount;
	public Development() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Development(String resName, int resExp, int resPay) {
		super(resName, resExp, resPay);
		// TODO Auto-generated constructor stub
	}
	public Development(String skillSet, int teamCount) {
		super();
		this.skillSet = skillSet;
		this.teamCount = teamCount;
	}
	public String getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(String skillSet) {
		this.skillSet = skillSet;
	}
	public int getTeamCount() {
		return teamCount;
	}
	public void setTeamCount(int teamCount) {
		this.teamCount = teamCount;
	}
}
