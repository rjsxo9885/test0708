package day5;
import java.util.Scanner;
public class Asobi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��øif 
	    // ����, ����, ���� ���� �Է¹޾�,
		//������ ��� ������ 
		//��� 90 �� �̻� A
		//���80�� �̻�B
		//���70�� �̻� C
		//��� 70�� �̸� F
	System.out.println("====����ó�� ���α׷�====");	
	Scanner input= new Scanner(System.in); //�Է¹޾ƾ� �ϴ� Scanne
	System.out.println("����:");
	int kor = input.nextInt();
	System.out.println("����:");
	int math = input.nextInt();
	System.out.println("����:");
	int eng = input.nextInt();

	
	
	int total= kor+ eng+ math;
	int avg= (kor+eng+math)/3;
	
	if(avg>=95) {
		System.out.println("���л�");
		
	}
	System.out.println("����:300");
	System.out.println("���:100");
	
		if (avg>=60) {
		System.out.println("�հ�");
		}
		
		else if (kor>=40|eng>=40| math>=40)
			System.out.println("�����");

	}
}

