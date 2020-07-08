
package day5;

import java.util.Scanner;
public class test0702_1 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		int a,b,c;
		System.out.println("첫번째 정수를 입력하시오");
		a= input.nextInt();
		System.out.println("두번째 정수를 입력하시오");
		b=input.nextInt();
		System.out.println("세번째정수를 입력하시오");
		c=input.nextInt();
		
		if(a<=1000&&b<=1000&&c<=1000) {
			if(a>b&&a<c||a<b&&a>c) 
				System.out.println(a);
				else if(b>a&&b<c||b<a&&b>c)
					System.out.println(b);
				else
					System.out.println(c);
			}
			else
				System.out.println("잘못 입력했습니다");
		}
}
		


	


