package day17;

import java.util.*;

public class MathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int dice1 =1;
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("�Ǽ� ��:");
			double x = sc.nextDouble();
			System.out.println("���밪 : "+Math.abs(x));
			System.out.println("������ : "+Math.sqrt(x));
			System.out.println("���� :"+Math.PI*Math.pow(x,2));
			
			System.out.println("0.0~1.0�� ���� 1���� �߻�"+Math.random());
			
			
			System.out.println("0~1�� ������ 1�� �߻�"+(int)Math.random());
			System.out.println("1~6������ ������ 1���߻�"+(int)Math.random()*6);
			
		
	}

}
