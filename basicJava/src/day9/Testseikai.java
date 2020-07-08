package day9;

import java.util.Scanner;
public class Testseikai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//문제1) 1~10까지의 정수의 합계를출력:for문 이용
		
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10까지의 합계 :"+sum);
	
	
	
		int end = sc.nextInt();
		int sum1 = 0;
		
		
		
		for(int i=1; i<=end; i++) {
			sum1 +=i;
		}
		System.out.println(sum1);
		
		
		
 }
}