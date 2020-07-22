package day18;

abstract class Parent{  //주로 부모역활만 한다
	
	String name = "부모";
	abstract void disp();		//추상 매서드
	void line() {}		//일반 매서드
	
	
}

class Son extends Parent{
	
	@Override
	void disp() {
		System.out.println("아들입니다");
	}
}

class Daughter extends Parent{
	void disp() {
		System.out.println("닯입니다");
	}
}



public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//에러 , 추상클래스는 인스턴스화 불가능
		//Parent papa = new Parent();
			Son son  = new Son();
			son.disp();
			Daughter daugh = new Daughter();
			daugh.disp();
			//다형성
			Parent pa = new Son();
			pa.disp();
			pa = new Daughter();
			pa.disp();
			
			
	}

}
