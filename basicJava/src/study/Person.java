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
		System.out.println("이 사람의 나이는 :"+age);
		System.out.println("이 사람의 이름은 :"+name);
		System.out.println("이 사람의 결혼 여부 "+(ismarried ?"기혼":"미혼"));
		System.out.println("이 사람의 성별 :"+gender);
		System.out.println("이 사람의 자녀수"+kid);
	}
	
	
	
}
