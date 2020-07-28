package day19;

	interface Father{ 
		public void printFather();
	}
	interface Mather{
		public void printMather();
	}
	
	
	class Son implements Father,Mather{
		@Override
		
		public void printMather() {
			System.out.println("엄마");
		}
		public void printFather() {
			
			System.out.println("아빠");
		}
		
		
		
		
		
	}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// 인터페이스와 클래스간 상속 및 구현
		// 인터페이스 :구현 imp
		// 추상클래스 : 상속 extends 
		// Java는 단독 상속만 가능하다.
		//		부모클래스 : 자식클래스 = 1:1
		//다중 구현은 가능하다.
		
		Son fa = new Son();
		fa.printFather();
		
		Son ma = new Son();
		
		ma.printMather();
	}

}
