package study;

import java.util.Scanner;

 




public class JavaEx001 {
	
	
	public static void name() {
		
		Scanner sc = new Scanner(System.in);
		String a = "ȫ�浿��!";
		 System.out.println(a);
		 
	 }
	public static void welcome() {
		String b = "ȯ���մϴ�";
		System.out.println(b);
	}
	public static void javawelcome() {
		String c = "�ڹ��� ���迡 ���� ���� ȯ���մϴ�";
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name();
		welcome();
		javawelcome();
		String b = "ȯ���մϴ�";
		String c = "�ڹ��� ���迡 ���Ű��� ȯ���մϴ�";
		System.out.println("ȫ�浿��!");
		System.out.printf("%s\n",b);
		System.out.print(c);
		
	}

}
