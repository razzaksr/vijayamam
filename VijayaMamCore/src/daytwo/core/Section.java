package daytwo.core;

public class Section 
{
	private Voter voter1,voter2,voter3;
	public String toString()
	{return voter1.toString()+" "+voter2.toString()+" "+voter3.toString()+"\n";}

	public Voter getVoter1() {
		return voter1;
	}

	public void setVoter1(Voter voter1) {
		this.voter1 = voter1;
	}

	public Voter getVoter2() {
		return voter2;
	}

	public void setVoter2(Voter voter2) {
		this.voter2 = voter2;
	}

	public Voter getVoter3() {
		return voter3;
	}

	public void setVoter3(Voter voter3) {
		this.voter3 = voter3;
	}
}
