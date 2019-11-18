package project1;

public class Args{

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		double ave = 0;
		a = Integer.valueOf(args[0]);
		b = Integer.valueOf(args[1]);
		c = Integer.valueOf(args[2]);
		ave = (a+b+c)/3.0;
		System.out.println(ave);
	}

}