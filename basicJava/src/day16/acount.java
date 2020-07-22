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
				
				System.out.println("잔액은 :"+sum);
		}
		
		
		
		
}
public class acount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		boolean end =false;
		
		
		System.out.println("---------------------------");
		System.out.println("1.입금 | 2.출금 | 3.조회 | 4.종료");
		System.out.println("---------------------------");
		
		
		
		
			
			
			
			Money mo = new Money();
			
			while (true) {
				 int a = sc.nextInt();
			if(a==1) {
				mo.Money(a);
				
				int b = sc.nextInt();
				System.out.println("입금액은 "+ mo.UpMoney(b)+"입니다" );
				
			}
			
			else if(a==2) {
				
				
				int b = sc.nextInt();
				
				if(mo.sum<b) {
					System.out.println("잔액이 부족합니다");
					continue;
				}else {
				System.out.println("출금액은 "+mo.DownMoney(b)+"입니다" );
				}
			}
			
			else if(a==3) {
				
				System.out.println(mo.sum);
			}
			else if(a==4) {
				 break;
			}
			else {
				System.out.println("잘못입력하였습니다"); 
			}
			}
			
		}
		
	}


