package basicJava;

public class variable {

	public static void main(String[] args) {
//변수 :메모리,상수를 저장하는 공간
//	상수 : 항상 같은 수, 값

		System.out.println(123);
		System.out.println("123");
		System.out.println(123+1);
		System.out.println("123+1");
		System.out.println("123"+1);

	}

}

/*
 * ======상수===
 * 정수형 상수:+1,3,5,-3
 * 실수형 상수:3.14,-3.14
 * 단정도형 실수 : 3.14f (4byte)
 * 배정도형 실수 : 3.14 (8byte)
 * 문자형 실수 :'a','A','1''+'...
 * 문자열형 상수 : "hello","Hi"....
 * 논리형 상수 : 참(true).거짓(false)
 * ======변수: memory========
 * 1.변수 선언문 : (자바의  경우 최초선언시 초기화를 해야한다)
 * 	    자료형 변수명
 * ex) int  age;
 * 2.변수 대입(배정 , 할당)문
 * 	      변수명 =값
 * ex) age = 20;
 * 
 *  #변수명 규칙 : 영문자 또는 소문자 
 *  -예약어는 변수 불가
 * 	
 * =====자료형(data type)===========
 * 1.기본(primitive) 타입.
 * 		1) 정수형:
 * 			byte -> char(2) -> short(2) -> int(4) -> long(8)
 * 		2) 실수형:
 * 			float(4) -> double(8)
 * 		3) 논리형:boolean(1)
 * 		4) 문자형:char(2)
 * 2.참조(reference) 타입(확장형,사용자정의자료형)
 * 		1)class(클래스형)
 * 		2)interface(인터페이스형)
 * 		3)array(배열형)
 * 		4)enum type(열거형)
 * 
 */
