package day20;
import java.util.Scanner;
class RandomDice{
	
	public int Dice() {
		
		return (int)(Math.random()*3);
	}
	
	
}



public class JavaEx028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomDice dice = new RandomDice();
		Scanner sc = new Scanner(System.in);
		int a;
		int b=0;
		
		System.out.println("=====��ǻ�Ϳ� ���� ���� �� ============");
		while(true) {
			System.out.println("����(0), ����(1), ��(2), ����(3) :");
			a = sc.nextInt();
			b = dice.Dice();
			if(b==0) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�");
			}else if(b==1) {
				System.out.println("��ǻ�ʹ� ������ �½��ϴ�");
				
			}else if(b==2) {
				System.out.println("��ǻ�ʹ� ���� �½��ϴ�");
			}
			
			if(a==0) {
				if(b==0) {
					System.out.println("���º��Դϴ�.");
				}else if(b==1) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}else if(b==2) {
					System.out.println("����� �¸��Դϴ�.");
				}
			}
			
			if(a==1) {//����
				if(b==0) {
					System.out.println("����� �¸��Դϴ�.");
				}else if(b==1) {
					System.out.println("���º��Դϴ�");
				}else if(b==2) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}
			}
			
			if(a==2) {
				if(b==0) {
					System.out.println("��ǻ�Ͱ� �̰���ϴ�");
				}else if(b==1) {
					System.out.println("����� �¸��Դϴ�");
				}else if(b==2) {
					System.out.println("���º��Դϴ�");
				}
			}
			
			if(a==3) {
				System.out.println("����");
				
				break;
			}
			
			
		}
		
		
		
	}

}
