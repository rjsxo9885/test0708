package day8;


import java.util.Scanner;

public class While0706_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number;
			int total= 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�����Է�:");
			number = sc.nextInt();
			
			if(number==0) {
				break;
			}else {
				total += number;
			}
			
		}
		System.out.println("����:"+total);
	}

}
