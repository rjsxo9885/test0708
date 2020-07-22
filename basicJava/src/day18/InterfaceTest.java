package day18;

 interface Animal{
	
	//추상 매서드만 존재
	abstract void kind();
	void breathe();
}
 
  class Elephant implements Animal{
	 @Override
	 
	  public void kind() {
		 System.out.println("포유류");
	 }
	 
	 @Override
	 
	 public void breathe() {
		 System.out.println("허파로 호흡중");
	 }
 }
 class Fish implements Animal{
	 
	 @Override
	 public void breathe() {
		 System.out.println("아가미로 호흡중");
	 }
	 
	 
 }





public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//인터페이스
				//추상클래스와  비슷,추상클래스보다 추상화 정도가 더 높음.
				//(일반)필드와(일반)메서드를 갖지 못함
				//추상매소드 "만"  존재
				//인터페이스는 반드시 클래스에서 추상메소드를 오버라이딩 해야만 한다.
				//(상위) --> 구현 --> (하위)
		
		
		Animal ani = new Elephant();
		ani.kind();
		ani.breathe();
		
		ani = new Fish();
		ani.kind();
		ani.breathe();
		
	}

}
