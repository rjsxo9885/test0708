package day18;

class test extends String{
	
}
class Animal{
	
	public void one() {}
	public final void two() {}
	
	
}

class Elephant extends Animal{
	@Override
	public void one() {
		System.out.println("one() override!");
	}
	//public void two(){}
	//에러 ,부모의 final 메서드는 override 할수없다
}



public class FinalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Elephant e = new Elephant();
		
		e.one();
		e.two();
		int a = 3;
		a = 30;
		a = 300;
		final int b = 7;
		
		final double Pi = 3.14; 
		
		
		
	}

}
