package day17;
import java.util.Scanner;





public class Test0723_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt();
		
		System.out.println("현재 금액"+Money+"원");
		System.out.println("500원:"+ Money/500);
		System.out.println("100원 :"+Money%500/100);
		System.out.println("50원 :"+Money%500%100/50);
		System.out.println("10원 :"+Money%500%100%50/10);
		System.out.println("바꾸지 못한 잔액 = "+Money%500%100%10+"원 입니다");
		
		
	}

}
