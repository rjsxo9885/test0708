package study;

import java.util.Scanner;

public class JavaEx006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * ����6]
���� �ϳ��� ���� ���� �ϳ��� �Է� �޾� 
�Է��� ���ڸ� ���ڸ�ŭ �ݺ�����ϼ���.

[���]
���� �ϳ� �Է� : # (����)
����(���)�Է� : 5 (����)
#####
 */
		Scanner sc = new Scanner(System.in);
		
		String a= sc.next();
		int b= sc.nextInt();
		
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
		
	}

}
