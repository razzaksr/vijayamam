package dayfour.aop;

public class Campus 
{
	private String name, role;private int hired;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@vijayaaspect
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getHired() {
		return hired;
	}
	public void setHired(int hired) {
		this.hired = hired;
	}
}
