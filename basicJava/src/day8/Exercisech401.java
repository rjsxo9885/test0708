package day8;

import java.util.Scanner;

public class Exercisech401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//문제 1 )1~10까지 정수의 합계를 출력
		
	/*	int sum = 0;
		
		for(int i=0; i<=10; i++) {
			
			sum = sum+i;
			
		}
		System.out.println(sum);
		*/
		
		
		//문제 2)1~end까지의 정수의 합계를 출력
		/*int sum = 0;
		
		
		int a = sc.nextInt();
		
		for(int i=0; i<=a; i++) {
			sum +=i;
		}
		System.out.println(sum);*/
		
		//문제 3)start ~ end 까지의정수의 합계를 출력
		
	        int a = sc.nextInt(); // 시작 정수
	          int b = sc.nextInt();//마지막 정수
	         int sum = 0;
	        for(int i=a; i<=b; i++ ) {
	        	sum = sum+i;
	        }
		      System.out.println(sum);
		   
	}

}
