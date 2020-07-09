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

		/*인수 =인자 =매개변수 =파라메터 =  argument =parameter
		 * 
		 * =======매개변수 전달방법===
		 * 
		 * 
		 * 호출하는 			호출당하는 함수
		 * caller  --call-->  callee
		 * 
		 * 			<--return 
		 * 실인수					가인수
		 * x					o
		 * o					x
		 * x					o
		 * o					o
		 * 
		 * 1.Call by value(값에 의한 변환)
		 * 2.Call by Reference
		 * 3.Call by Reference(참조에 의한 전달)
		 * 
		 * 
		 */
		
		//1. 실인수 ,반환값이 모두 없는경우 
		//:Hello Java 를 출력하는 메서드를(callTest1)만들고 main()에서 호출
		
		//2.실인수 있고 ,반환값이 없는경우
		//매게변수로 횟수를 방아 그 횟수 만큼 "HELLO JAVA"를 출력하는 매서드(callTest2)
		
		//3.실인수 없고 , 반환값이 있는경우
		//1~100까지의 홀수의 합을 구하고 그 값을 반환해주는 메서드를 만들고 
		//main()에서 그 값을 출력
		
		//4.실인수 있고 , 반환값이 있는경우
		//:두 실수를 매개변수로 전달 받아 두 수의 곱을 구하고 메서드(callTest4)를 만들고
		//main()에서 그 값을 출력
		
		callTest1();
		callTest2(6);
		callTest3();
		callTest4(3,4);
		System.out.println(callTest3());
		System.out.println(callTest4(3.14,4.13));
		

	}

}
