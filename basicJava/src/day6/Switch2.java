package day6;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//�ֻ��� �������Է�(1~6)
			//Ȧ��,¦�� ����
			//"Ȧ������ ", "¦������" ���
		
		int a;
		Scanner sc = new Scanner(System.in);
		a =  sc.nextInt();
		
		switch(a){
			case 1:
				System.out.println("Ȧ�� :1"); break;
			case 2: 
				System.out.println("¦�� :2"); break;
			case 3:
				System.out.println("Ȧ�� :3"); break;
			case 4:
				System.out.println("¦�� :4"); break;
			case 5:
				System.out.println("Ȧ�� :5"); break;
			case 6:
				System.out.println("¦�� :6"); break;
			default:
			    System.out.println("�߸� �Է��߽��ϴ�"); break;
			}	
		}
	}


