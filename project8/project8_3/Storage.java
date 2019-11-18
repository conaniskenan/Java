package project8.project8_3;

import java.util.ArrayList;

public class Storage {
	ArrayList num = new ArrayList();

	public void setNum(int num) {
		this.num.add(num);
	}

	public Object GetNum(int pos) {
		return num.get(pos);
	}
}