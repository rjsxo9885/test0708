package day9;

import java.util.Scanner;
public class Testseikai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//����1) 1~10������ ������ �հ踦���:for�� �̿�
		
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1~10������ �հ� :"+sum);
	
	
	
		int end = sc.nextInt();
		int sum1 = 0;
		
		
		
		for(int i=1; i<=end; i++) {
			sum1 +=i;
		}
		System.out.println(sum1);
		
		
		
 }
}