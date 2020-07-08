package day6;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a =2;
		int b =1;
		
		while(a<=9) {
		while(b<=9) {
			System.out.printf("%d X %d = %d\n",a,b,a*b);
			b++;
		}
		b=1;
		a++;
	}

	/*	int a = 1;
		int sum = 0;
		while(a<10) {
			
			sum= sum+a;
			a++;
		}
		System.out.println("sum ="+sum);
		*/
}
}