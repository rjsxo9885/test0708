package study;
import java.util.Scanner;
public class JavaEx004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*[���]
=== Happy Coffee MENU ===
1. ���������Ҵ� 2000��
2. �Ƹ޸�ī�� 2500��
3. īǪġ�� 3000��
4. ī��� 3500��
5. ����
====================
�ֹ��� ���� : 2 (����)
�ֹ� �ܼ� : 3 (����)
�ֹ��Ͻ� �Ƹ޸�ī�� 3���� 7500�� �Դϴ�.
*/
		
		Scanner sc = new Scanner(System.in);
		int a =2000;
		int b =2500;
		int c = 3000;
		int d = 3500;
		String x = "����������";
		String y = "�Ƹ޸�ī��";
		String z = "īǪġ��";
		String l = "ī���";
		
		System.out.printf("=====Happy coffe MENU======\n");
		System.out.println("1.���������Ҵ� 2000��");
		System.out.println("2.�Ƹ޸�ī��� 2500��");
		System.out.println("3.īǪġ�� 3000��");
		System.out.println("4.ī��� 3500��");
		System.out.println("5.����");
		int f = sc.nextInt();//���� ����
		int g = sc.nextInt();//�ܼ�
		
		if(f==1) {
			System.out.printf("�ֹ��Ͻ�%s %d���� %d���Դϴ�",x,g,a*g);
		}else if(f==2) {
			System.out.printf("�ֹ��Ͻ�%s %d���� %d���Դϴ�",y,g,b*g);
			
		}else if(f==3) {
			
			System.out.printf("�ֹ��Ͻ�%s %d���� %d���Դϴ�",z,g,c*g);
		}else if(f==4) {
			System.out.printf("�ֹ��Ͻ�%s %d���� %d���Դϴ�",l,g,d*g);
		}else  if(f==5) {
			System.out.println("����");
		}
	}

}
