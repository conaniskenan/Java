package project3;

import java.util.Scanner;

public class Ring {
	private int innerRadius;
	private int outerRadius;
	private String color;
	private double area;
	public static double pai;
	public static int num=0;
	public int getInnerRadius() {
		return innerRadius;
	}
	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}
	public static void setPai(double pai) {
		Ring.pai=pai;
	}
	public static void setNum(int num) {
		Ring.num=num;
	}
	public int getOuterRadius() {
		return outerRadius;
	}
	public void setOuterRadius(int outerRadius) {
		this.outerRadius = outerRadius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double areas() {	
		this.area=pai*(this.outerRadius*this.outerRadius-this.innerRadius*this.innerRadius);
		return area;
	}
	public Ring(int innerRadius,int outerRadius) {
		this.innerRadius=innerRadius;
		this.outerRadius=outerRadius;
		num++;
		setNum(num);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "圆环的面积是"+areas()+"圆对象个数："+num;
	}
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int flag=1;
		while(flag!=-1) {
			System.out.print("内圆半径：");
			int a=cin.nextInt();
			System.out.print("外圆半径：");
			int b =cin.nextInt();
			System.out.print("圆周率：");
			double p=cin.nextDouble();
			setPai(p);
			Ring r =new Ring(a,b);
			r.areas();
			System.out.println(r);
			System.out.println("按任意数字键继续，-1退出");
			flag=cin.nextInt();
		}
		cin.close();
	}
	
}