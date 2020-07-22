package day15;

class Father extends Object{
	String name = "�ƺ�";
	int age=15;
	public Father() { //�⺻ ������
		System.out.println("Father()....");
		
	}
	public Father(String name,int age) { //�Ű����� ������
		this.name = name;
		this.age = age;
		
	}
	
}

class Son extends Father {
	String name = "ȫ�浿";
	public Son() {
		super();		//�θ��� ������ �Լ� ��������
		System.out.println("Son()...");
	}
	public void disp() {
		System.out.println(name); //��������
		System.out.println(this.name);//�ڽ��� �ʵ�
		System.out.println(this.age); // �ڽ��� �ǵ�
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
		// super : �θ�ü
		//super.�ʵ�� : �θ��� �ʵ�
		//super():�θ��� ������
		//this:�ڽ� ��ü
		//this.�ʵ�� :�ڽ��� �ʵ�
		//this():�ڽ��� ������
		Son son = new Son(); //�θ� �⺻ ������  -> �ڽ� �⺻ ������
		son.disp();
		System.out.println("===========");
		Daughter jane = new Daughter();
		
		System.out.println(jane.name);
		
		Daughter anna = new Daughter("�ȳ�",20,"����");//�θ�Ű����� ������ ->�ڽ� �Ű����� ������
		System.out.println(anna.name);
		System.out.println(anna.age);
		System.out.println(anna.address);
		
	}

}
