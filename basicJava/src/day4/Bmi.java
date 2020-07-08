package day4;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cm = sc.nextInt();
		int kg = sc.nextInt();
		double a = 3.144;
		double bmi = (double)kg/(double)(cm*cm)*10000;
		
		System.out.println(Math.round(bmi*100)/100.0);//
		
		System.out.println(Math.round(a)); //round함수는 정수에 가장가까운값을 반올림한다
		
		//System.out.println(String.format("%.2f", bmi));
		
		
		System.out.println(String.format("%.2f", bmi)); //형태를 바꾸어준다
		
		System.out.printf("%.2f",bmi);
		
		
	}

}
