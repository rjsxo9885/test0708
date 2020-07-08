package day7;

import java.util.Scanner;

public class test0706_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int b= sc.nextInt();
		int a = 1;
		int fac = 1;
		
		for(int i=b ; i>=1; i--) {
			fac = fac*i;
		}
		System.out.printf("!%d= %d¿Ã¥Ÿ",b,fac);
		
		
	}

}
