package study;

import java.util.Scanner;

 




public class JavaEx001 {
	
	
	public static void name() {
		
		Scanner sc = new Scanner(System.in);
		String a = "홍길동님!";
		 System.out.println(a);
		 
	 }
	public static void welcome() {
		String b = "환영합니다";
		System.out.println(b);
	}
	public static void javawelcome() {
		String c = "자바의 세계에 오신 것을 환영합니다";
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name();
		welcome();
		javawelcome();
		String b = "환영합니다";
		String c = "자바의 세계에 오신것을 환영합니다";
		System.out.println("홍길동님!");
		System.out.printf("%s\n",b);
		System.out.print(c);
		
	}

}
