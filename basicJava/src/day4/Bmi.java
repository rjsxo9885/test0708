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
		
		System.out.println(Math.round(a)); //round�Լ��� ������ ���尡���� �ݿø��Ѵ�
		
		//System.out.println(String.format("%.2f", bmi));
		
		
		System.out.println(String.format("%.2f", bmi)); //���¸� �ٲپ��ش�
		
		System.out.printf("%.2f",bmi);
		
		
	}

}
