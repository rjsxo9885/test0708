package day9;

public class Test0709_1 {
	
	public static int add(int a , int b) {
		return a+b;
	}
	public static char add(char a,char b) {
		
		return (char)(a+b);
	}
	
	
	public static String add(String n,String m) {
		return n+m;
	}
	
	public static double add(double n,double m) {
		return n+m;
	}
	
	//메소드 오버로딩 <--------메소드 중복
	//:(한 클래스 내에서)
	//메소드 명은 같고
	//매개변수의 갯수 또는 자료형이 다른경우
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int r1 = add(10,20);
		double r2 = add(1.1,2.2);
		char r3 = add('1','A');
		String r4 = add("Hello","JAVA");
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}

}
