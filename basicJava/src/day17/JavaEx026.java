package day17;

class Animal {
    public String name;
    public Animal ( String name ) {
          this.name = name; 
    }
    void eat() {
       System.out.println("�Ļ縦 �ؿ�");
   }
}

class Bird extends Animal{
	 public Bird(String name) {
		 super(name);
	 }
	 @Override
	 void eat() {
		 super.eat();
		System.out.println("������ ��ƸԾ��");
	}
	 void fiy() {
		System.out.println("���� �־��");
	}
	
}



public class JavaEx026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Bird bird = new Bird("��") ;
		bird.eat();
		bird.fiy();
		
		
	}

}
