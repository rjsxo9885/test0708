package study;

import java.util.Scanner;

public class JavaEx009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double max =  0;
		
		double [] a = new double[5]; 
		
		for(int i=0; i<5; i++) {
			a[i]= sc.nextDouble();
			
			if(a[i]>max) {
				max =a[i];
			}
			
		}
		System.out.println(max);
		
	}

}
