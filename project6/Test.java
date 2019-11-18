package project6;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("张三");
		names.add("李四");
		names.add("王五");
		names.add("马六");
		names.add("赵七");
		for (int i = 0; i < names.size(); i++) {
			System.out.println("第" + (i + 1) + "条的数据为：" + names.get(i));
		}
		System.out.println("集合的大小为：" + names.size());
		names.remove(2);
		for (int i = 0; i < names.size(); i++) {
			System.out.println("第" + (i + 1) + "条的数据为：" + names.get(i));
		}
		System.out.println("第三条数据为：" + names.get(2));
		System.out.println("集合的大小为：" + names.size());
	}

}

