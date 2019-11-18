package project4.t1;

public class Student extends People {
	private double gaokao;
	private String major;
	private String clas;

	public double getGaokao() {
		return gaokao;
	}

	public void setGaokao(double gaokao) {
		this.gaokao = gaokao;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	@Override
	public String toString() {
		return "[Name=" + getName() + ", Gender=" + getGender() + ", Num=" + getNum() + ", clas=" + clas
				+ ", gaokao=" + gaokao + ", major=" + major + ", Birthday()=" + getBirthday()
				+ "]";
	}
}
