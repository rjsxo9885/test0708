package study;

public class Person {
	public String name;
	public int age;   
	
	boolean ismarried;
	public int kid;
	public char gender;
	public int children;
	
public void setPerson(String n,int a,char g,boolean m,int c){
	name =n;
	age =a;
	gender =g;
	ismarried =m;
	children =c;
	
}
	
	


	
	
	public void disp() {
		System.out.println("�� ����� ���̴� :"+age);
		System.out.println("�� ����� �̸��� :"+name);
		System.out.println("�� ����� ��ȥ ���� "+(ismarried ?"��ȥ":"��ȥ"));
		System.out.println("�� ����� ���� :"+gender);
		System.out.println("�� ����� �ڳ��"+kid);
	}
	
	
	
}
