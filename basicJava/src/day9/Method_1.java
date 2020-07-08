package day9;

public class Method_1 {
	
	//클래스(class ) :field + method
	//맴버 변수 : 속성,필드s
	//맴버 함수 : 메소드s
	/*1.메소드 정의(구현)
	 *2.메소드 호출
	 * 	접근자
	 * 	public static 반환형 메소드명(가인수1,가인수2,가인수3.......){
	 *     명령문;
	 *     return 반환값
	 *     }
	 *     
	 * 2.(사용자  정의) 메소드 호출
	 * 메소드명();
	 * 메소드명(실인수1, 실인수2,실인수3-----------);
	 */
	
	public static void test() {
		System.out.println("test() 메소드 왔다감!!");
	}
	public static void test1(int a){
		System.out.println(a);
	}
	public static void test2(double b) {
		System.out.println(b);
	}
	public static void test3(char a) {
		System.out.println(a);
	}
	public static void test4(String a) {
		System.out.println(a);
	}
	public static void test5(int a,int b) {

		System.out.println(a+b);
	}
	
	//test6의 기능 : 두 실수를 전달받아 실수의 합을 반환
	public static double test6(double x,double y) {
		double z = x+y;
		return z;
	}
	public static void main(String[] args) { //메소드 헤더
		// TODO Auto-generated method stub

		
		
		System.out.println("main()메소드 :프로그램의 시작"); // 메소드 바디
		
		test();//메서드 호출문 : CALL
		test1(10);
		test2(3.14);
		test3('A');
		test4("hi");
		test5(10,20);
		test6(3.14,3.3);
		System.out.println("test()메소드 호출후 돌아옴!!");
		System.out.println("main()메소드: 프로그램 실행의 끝!");
		
		
	}//main end

}//class end
