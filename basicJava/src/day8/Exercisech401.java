package day8;

import java.util.Scanner;

public class Exercisech401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//���� 1 )1~10���� ������ �հ踦 ���
		
	/*	int sum = 0;
		
		for(int i=0; i<=10; i++) {
			
			sum = sum+i;
			
		}
		System.out.println(sum);
		*/
		
		
		//���� 2)1~end������ ������ �հ踦 ���
		/*int sum = 0;
		
		
		int a = sc.nextInt();
		
		for(int i=0; i<=a; i++) {
			sum +=i;
		}
		System.out.println(sum);*/
		
		//���� 3)start ~ end ������������ �հ踦 ���
		
	        int a = sc.nextInt(); // ���� ����
	          int b = sc.nextInt();//������ ����
	         int sum = 0;
	        for(int i=a; i<=b; i++ ) {
	        	sum = sum+i;
	        }
		      System.out.println(sum);
		   
	}

}
