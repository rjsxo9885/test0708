package day9;

import java.util.Scanner;

public class Test0709 {
	Scanner sc = new Scanner(System.in);
	
	public static int area1(int a, int b) {
		
		int area = a*b;
		return area;
		}
	
	public static void test3() {
		
		int a = 3;
		int b = 4;
		System.out.println("ÇÇ°ï"+a+b);
	}
	public static double area2(double radius) {
		
		double area = Math.pow(radius, 2)*Math.PI;
		
		return area;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.out.println(area1(3,4));
		
		System.out.printf("%.2f\n",area2(3));
		
		test3();
		
	}

}
