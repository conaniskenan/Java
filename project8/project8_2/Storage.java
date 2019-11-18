package project8.project8_2;

import java.util.ArrayList;

public class Storage {
	@SuppressWarnings("rawtypes")
	ArrayList num = new ArrayList();

	@SuppressWarnings("unchecked")
	public void setNum(int num) {
		this.num.add(num);
	}

	public Object GetNum(int pos) {
		return num.get(pos);
	}
}