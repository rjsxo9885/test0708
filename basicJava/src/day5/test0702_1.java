
package day5;

import java.util.Scanner;
public class test0702_1 {

	public static void main(String[] args) {
		
		Scanner input =  new Scanner(System.in);
		
		int a,b,c;
		System.out.println("ù��° ������ �Է��Ͻÿ�");
		a= input.nextInt();
		System.out.println("�ι�° ������ �Է��Ͻÿ�");
		b=input.nextInt();
		System.out.println("����°������ �Է��Ͻÿ�");
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
				System.out.println("�߸� �Է��߽��ϴ�");
		}
}
		


	


