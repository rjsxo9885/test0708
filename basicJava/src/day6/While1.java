package day6;

import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		while(i<4) {
			System.out.println("HI,JAVA");
			i++;
		}
		System.out.println("최종 i : "+i);
		System.out.println("반복횟수 : "+(i-1));
	}

}
