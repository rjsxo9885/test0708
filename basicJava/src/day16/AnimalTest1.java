package day16;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다");
	}
		
	
}
 class Human extends Animal{
	 @Override
	 
	 public void move() {

		 
		 System.out.println("사람이 두발로 걷습니다");
		
	 }
}
 
 class Tiger extends Animal{
	 @Override
	 public void move() {
		 System.out.println("호랑이가 네 발로 걷습니다");
	 }
 }
 
 class Eagle extends Animal{
	 @Override
	 public void move() {
		 System.out.println("독수리가 하늘을 납니다");
	 }
 }
 

public class AnimalTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Animal ani = new Animal();
		  Human hum = new Human();
		  Tiger ti = new Tiger();
		  Eagle ea = new Eagle();
		  ani.move();
		  hum.move();
		  ti.move();
		  ea.move();
	}

}
