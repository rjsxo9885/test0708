package day15;
//Object클래스는 모든 클래스의 슈퍼클래스이다.
//				자바클래스 계층 구조의 최상위 위치
//				java.lang 패키지에 포함
class korea{
	public void korea() {
		System.out.println("Korea()..");
	}
}
class Seoul extends korea{
	//super();
	public void Seoul(){
		System.out.println("Seoul()....");
	}
}
class Guro extends Seoul{
	//super();  //생략
	//:부모 생성자 함수 자동 호출 메소드
	public void Guro() {
		System.out.println("Guro()...");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// 상속관계에서 생성자호출 순서
		//(자식클래스_객체)먼저 부모 생성자를 호출하고 ,자신의 생성자를 호출한다
		
		//"자식" 객체 생성
		
		Seoul se = new Seoul();
		se.Seoul();
	}

}
