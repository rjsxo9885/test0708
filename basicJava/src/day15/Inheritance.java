package day15;
//라이브러리클래스

class AA{
	public void one() {
		System.out.println("AA클래스의 one()...");
	}
	public void two() {
		System.out.println("AA클래스의 two()....");
	}
	//자식클래스      부모클래스
	
}//AA class-end
class BB extends AA{
	public void three(){
		System.out.println("BB클래스의 three()");
	}
	
}//bb클래스 엔드
class CC extends BB{
      public void four() {
    	  System.out.println("CC클래스의 four()");
      }
}
class DD extends CC{
	public void five() {
		System.out.println("DD클래스의 five");
	}
}

 
public class Inheritance { //실행 클래스(main()메소드가존재하는 클래스)

	public static void main(String[] args) {
		// (두)class 간의 상속:단일 상속,다중상속
		//interface간의 상속
		//상속:상위,부모,기본
		//	  하위,자식,파생
		
		AA a1 = new AA();
		a1.one();
		a1.two();
		
		BB b1 = new BB();
		b1.one();
		b1.two();
		b1.three();
		
		CC c1 = new CC();
		
		c1.one();
		c1.two();
		c1.three();
		c1.four();
		
		DD d1 = new DD();
		
		d1.one();
		d1.two();
		d1.three();
		d1.four();
		d1.five();
		
	}

}
