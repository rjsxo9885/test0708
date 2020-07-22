package day17;

import java.util.*;

public class MathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int dice1 =1;
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("실수 값:");
			double x = sc.nextDouble();
			System.out.println("절대값 : "+Math.abs(x));
			System.out.println("제곱값 : "+Math.sqrt(x));
			System.out.println("면적 :"+Math.PI*Math.pow(x,2));
			
			System.out.println("0.0~1.0의 난수 1개를 발생"+Math.random());
			
			
			System.out.println("0~1의 난수를 1개 발생"+(int)Math.random());
			System.out.println("1~6사이의 난수를 1개발생"+(int)Math.random()*6);
			
		
	}

}
