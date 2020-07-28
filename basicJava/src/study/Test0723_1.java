package study;

import java.util.Scanner;

public class Test0723_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 초기화
		Scanner sc = new Scanner(System.in);
		int [] a = new int [6];
		int sum =0;          //총합계
		for(int i=0; i<6; i++) {
			
			a[i]= sc.nextInt(); //인구 값
			sum = a[i]+2;
			
		}
		
		for(int i =0; i<6; i++) { //i = 층수
			
			
			System.out.printf("%d층에 살고있는 인원 : %d\n",i+1,a[i]);
			
			System.out.println("총  인원  :"+sum);
			
		}
		
		
		
		
	}

}
