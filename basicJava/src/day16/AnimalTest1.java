package day16;

class Animal{
	public void move() {
		System.out.println("������ �����Դϴ�");
	}
		
	
}
 class Human extends Animal{
	 @Override
	 
	 public void move() {

		 
		 System.out.println("����� �ι߷� �Ƚ��ϴ�");
		
	 }
}
 
 class Tiger extends Animal{
	 @Override
	 public void move() {
		 System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�");
	 }
 }
 
 class Eagle extends Animal{
	 @Override
	 public void move() {
		 System.out.println("�������� �ϴ��� ���ϴ�");
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
