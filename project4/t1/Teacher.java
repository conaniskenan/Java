package project4.t1;


public class Teacher extends People{
	private String dep;
	private String prof;
	private double sal;
	
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
	@Override
	public String toString() {
		return "[Name=" + getName() + ", Gender=" + getGender() + ", Num=" + getNum() + ", sal=" + sal
				+ ", dep=" + dep + ", prof=" + prof + ", Birthday()=" + getBirthday()
				+ "]";
	}
}