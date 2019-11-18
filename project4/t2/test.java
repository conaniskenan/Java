package project4.t2;

import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		Undergaduate u1 = new Undergaduate("小红", "Java", 90);
		Undergaduate u2 = new Undergaduate("小明", "Java", 70);
		Postgraduate p1 = new Postgraduate("小刚", "Java", 30);
		Postgraduate p2 = new Postgraduate("小华", "Java", 50);
		list.add(u1);
		list.add(u2);
		list.add(p1);
		list.add(p2);
		for (Object l : list) {
			//本科生标准
			if (l instanceof Undergaduate && ((Undergaduate) l).score >= 80) {
				Undergaduate.youxiu++;
			} else if (l instanceof Undergaduate && ((Undergaduate) l).score >= 70 && ((Undergaduate) l).score <= 80) {
				Undergaduate.lianghao++;
			} else if (l instanceof Undergaduate && ((Undergaduate) l).score >= 60 && ((Undergaduate) l).score <= 70) {
				Undergaduate.yiban++;
			} else if (l instanceof Undergaduate && ((Undergaduate) l).score >= 50 && ((Undergaduate) l).score <= 60) {
				Undergaduate.jige++;
			} else if (l instanceof Undergaduate && ((Undergaduate) l).score <= 50) {
				Undergaduate.bujige++;
			}

			//研究生标准
			if (l instanceof Postgraduate && ((Postgraduate) l).score >= 90) {
				Postgraduate.youxiu++;
			} else if (l instanceof Postgraduate && ((Postgraduate) l).score >= 80 && ((Postgraduate) l).score <= 90) {
				Postgraduate.lianghao++;
			} else if (l instanceof Postgraduate && ((Postgraduate) l).score >= 70 && ((Postgraduate) l).score <= 80) {
				Postgraduate.jige++;
			} else if (l instanceof Postgraduate && ((Postgraduate) l).score >= 60 && ((Postgraduate) l).score <= 70) {
				Postgraduate.yiban++;
			} else if (l instanceof Postgraduate && ((Postgraduate) l).score <= 50) {
				Postgraduate.bujige++;
			}
		}


		//输出
		System.out.println("本科生优秀人数为：" + Undergaduate.youxiu);
		System.out.println("本科生良好人数为：" + Undergaduate.lianghao);
		System.out.println("本科生一般人数为：" + Undergaduate.yiban);
		System.out.println("本科生及格人数为：" + Undergaduate.jige);
		System.out.println("本科生不及格人数为：" + Undergaduate.bujige);
		System.out.println("研科生优秀人数为：" + Postgraduate.youxiu);
		System.out.println("研科生良好人数为：" + Postgraduate.lianghao);
		System.out.println("研科生一般人数为：" + Postgraduate.yiban);
		System.out.println("研科生及格人数为：" + Postgraduate.jige);
		System.out.println("研科生不及格人数为：" + Postgraduate.bujige);
	}

}