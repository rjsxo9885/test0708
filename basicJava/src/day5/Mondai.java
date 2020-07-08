package day5;

import java.util.Scanner;
public class Mondai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc  = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(a);
		}else if(a<b) {
			System.out.println(b);
		}else if(a==b) {
			System.out.println("eq");
		}
		
		
		
	}

}
