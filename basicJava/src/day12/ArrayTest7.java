package day12;


import java.util.Scanner;

public class ArrayTest7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double avg =0 ;
		double sum =0;
		
		String[] names = {"abs","bbs","ccq","dde"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요소 수를 입력하시오");
		int cd = sc.nextInt();
		double [] ab = new double [cd];
		
		for(int i=0; i<ab.length; i++) {
			
			
			System.out.println(i+1+"번째 수를 입력하시오");
			ab[i] = sc.nextDouble();
			
			sum = sum+ab[i];
			
			
			
		}
		for(int j=0; j<ab.length; j++) {
			System.out.printf("a[%d]=%.1f\n",j,ab[j]);
		}
		
		
		avg = sum/ab.length;
		System.out.println("배열의 합= "+sum);
		System.out.println("배열의 평균 = "+avg);
		
		String cc = "방건태";
	
		System.out.printf("저는 %s입니다",cc);
		
	}

}
