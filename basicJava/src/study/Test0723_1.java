package study;

import java.util.Scanner;

public class Test0723_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�迭 �ʱ�ȭ
		Scanner sc = new Scanner(System.in);
		int [] a = new int [6];
		int sum =0;          //���հ�
		for(int i=0; i<6; i++) {
			
			a[i]= sc.nextInt(); //�α� ��
			sum = a[i]+2;
			
		}
		
		for(int i =0; i<6; i++) { //i = ����
			
			
			System.out.printf("%d���� ����ִ� �ο� : %d\n",i+1,a[i]);
			
			System.out.println("��  �ο�  :"+sum);
			
		}
		
		
		
		
	}

}
