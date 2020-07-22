package day15;

class Father extends Object{
	String name = "아빠";
	int age=15;
	public Father() { //기본 생성자
		System.out.println("Father()....");
		
	}
	public Father(String name,int age) { //매개변수 생성자
		this.name = name;
		this.age = age;
		
	}
	
}

class Son extends Father {
	String name = "홍길동";
	public Son() {
		super();		//부모의 생성자 함수 생략가능
		System.out.println("Son()...");
	}
	public void disp() {
		System.out.println(name); //지역변수
		System.out.println(this.name);//자신의 필드
		System.out.println(this.age); // 자신의 피드
		System.out.println(super.name);
		System.out.println(super.age);
	}
}
class Daughter extends Father{
	public String address;
	public Daughter() {
		//super();
	}
	public Daughter(String name,int age,String address) {
		super(name,age);
		this.address = address;
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		// super : 부모객체
		//super.필드명 : 부모의 필드
		//super():부모의 생성자
		//this:자신 객체
		//this.필드명 :자신의 필드
		//this():자신의 생성자
		Son son = new Son(); //부모 기본 생성자  -> 자식 기본 생성자
		son.disp();
		System.out.println("===========");
		Daughter jane = new Daughter();
		
		System.out.println(jane.name);
		
		Daughter anna = new Daughter("안나",20,"구로");//부모매개변수 생성자 ->자식 매개변수 생성자
		System.out.println(anna.name);
		System.out.println(anna.age);
		System.out.println(anna.address);
		
	}

}
