package day16;
import java.util.Scanner;

class Money{

	int money;
	int sum=0;
		public void Money(int money) {
				this.money = money;
				
				
				
		}
   
		public int UpMoney(int money){
			   return sum += money;
			
		}
		public int  DownMoney(int money) {
				return sum -= money;
		}
		
		public void NowMoney() {
				
				System.out.println("�ܾ��� :"+sum);
		}
		
		
		
		
}
public class acount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		boolean end =false;
		
		
		System.out.println("---------------------------");
		System.out.println("1.�Ա� | 2.��� | 3.��ȸ | 4.����");
		System.out.println("---------------------------");
		
		
		
		
			
			
			
			Money mo = new Money();
			
			while (true) {
				 int a = sc.nextInt();
			if(a==1) {
				mo.Money(a);
				
				int b = sc.nextInt();
				System.out.println("�Աݾ��� "+ mo.UpMoney(b)+"�Դϴ�" );
				
			}
			
			else if(a==2) {
				
				
				int b = sc.nextInt();
				
				if(mo.sum<b) {
					System.out.println("�ܾ��� �����մϴ�");
					continue;
				}else {
				System.out.println("��ݾ��� "+mo.DownMoney(b)+"�Դϴ�" );
				}
			}
			
			else if(a==3) {
				
				System.out.println(mo.sum);
			}
			else if(a==4) {
				 break;
			}
			else {
				System.out.println("�߸��Է��Ͽ����ϴ�"); 
			}
			}
			
		}
		
	}


