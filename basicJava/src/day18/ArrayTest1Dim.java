package day18;

import java.util.Scanner;

public class ArrayTest1Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		int []  a=  new int[6];
		int sum =0;
		
		for(int i=0; i<6; i++) {
			a[i] = sc.nextInt();
			sum+= a[i];
			
		}
		for(int i=0; i<6; i++) {
			System.out.printf("%d층에 사는 인수 : %d명\n",i+1,a[i]);
			
		}
		System.out.println("총 인원수 ="+sum);
	}

}
