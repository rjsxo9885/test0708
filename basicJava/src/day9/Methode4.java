package day9;

public class Methode4 {

	public static void callTest1() {
		System.out.println("Hello Java");
	}
	public static void callTest2(int a) {
		for(int i=0; i<a; i++) {
			System.out.println("Hello Java");
		}
	}
	public static int callTest3() {
		int sum =0;
		int test ;
		for(int i=0; i<100; i++) {
			if(i%2!=0) sum+=i; 
				
			
		}
		return sum;
		
	}
    public static double callTest4(double a,double b) {
		
		   return a*b;
		 
		 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*�μ� =���� =�Ű����� =�Ķ���� =  argument =parameter
		 * 
		 * =======�Ű����� ���޹��===
		 * 
		 * 
		 * ȣ���ϴ� 			ȣ����ϴ� �Լ�
		 * caller  --call-->  callee
		 * 
		 * 			<--return 
		 * ���μ�					���μ�
		 * x					o
		 * o					x
		 * x					o
		 * o					o
		 * 
		 * 1.Call by value(���� ���� ��ȯ)
		 * 2.Call by Reference
		 * 3.Call by Reference(������ ���� ����)
		 * 
		 * 
		 */
		
		//1. ���μ� ,��ȯ���� ��� ���°�� 
		//:Hello Java �� ����ϴ� �޼��带(callTest1)����� main()���� ȣ��
		
		//2.���μ� �ְ� ,��ȯ���� ���°��
		//�ŰԺ����� Ƚ���� ��� �� Ƚ�� ��ŭ "HELLO JAVA"�� ����ϴ� �ż���(callTest2)
		
		//3.���μ� ���� , ��ȯ���� �ִ°��
		//1~100������ Ȧ���� ���� ���ϰ� �� ���� ��ȯ���ִ� �޼��带 ����� 
		//main()���� �� ���� ���
		
		//4.���μ� �ְ� , ��ȯ���� �ִ°��
		//:�� �Ǽ��� �Ű������� ���� �޾� �� ���� ���� ���ϰ� �޼���(callTest4)�� �����
		//main()���� �� ���� ���
		
		callTest1();
		callTest2(6);
		callTest3();
		callTest4(3,4);
		System.out.println(callTest3());
		System.out.println(callTest4(3.14,4.13));
		

	}

}
