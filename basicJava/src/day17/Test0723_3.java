package day17;
import java.util.Scanner;





public class Test0723_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Money = sc.nextInt();
		
		System.out.println("���� �ݾ�"+Money+"��");
		System.out.println("500��:"+ Money/500);
		System.out.println("100�� :"+Money%500/100);
		System.out.println("50�� :"+Money%500%100/50);
		System.out.println("10�� :"+Money%500%100%50/10);
		System.out.println("�ٲ��� ���� �ܾ� = "+Money%500%100%10+"�� �Դϴ�");
		
		
	}

}
