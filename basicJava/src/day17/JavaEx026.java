package day17;

class Animal {
    public String name;
    public Animal ( String name ) {
          this.name = name; 
    }
    void eat() {
       System.out.println("식사를 해요");
   }
}

class Bird extends Animal{
	 public Bird(String name) {
		 super(name);
	 }
	 @Override
	 void eat() {
		 super.eat();
		System.out.println("곤충을 잡아먹어요");
	}
	 void fiy() {
		System.out.println("날수 있어요");
	}
	
}



public class JavaEx026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Bird bird = new Bird("새") ;
		bird.eat();
		bird.fiy();
		
		
	}

}
