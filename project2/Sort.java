package project2;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Sort s=new Sort();	
		System.out.print(Arrays.toString(s.selectSort(s.getArrs())));
	}
	
	public int[] getArrs() {
		Scanner cin =new Scanner(System.in);
		System.out.print("请输入数组长度：");
		int a=cin.nextInt();
		int []arrs=new int[a];
		System.out.print("请输入"+a+"个整数:");
		for (int i = 0; i < arrs.length; i++) {
			arrs[i]=cin.nextInt();
		}
		cin.close();
		return arrs;
	}
	
	public int[] selectSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            int minIndex = i;
            for (int j = i+1; j <arrs.length; j++) {
                if (arrs[minIndex] > arrs[j]) {
                    minIndex = j;
                }
            }
            if (i!=minIndex) {
                int temp = arrs[i];
                arrs[i] = arrs[minIndex];
                arrs[minIndex] = temp;
            }
        }	
        return arrs;
    }

}
