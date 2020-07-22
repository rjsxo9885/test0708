package study;
import java.util.Scanner;
public class JavaEx004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*[결과]
=== Happy Coffee MENU ===
1. 에스프레소는 2000원
2. 아메리카노 2500원
3. 카푸치노 3000원
4. 카페라떼 3500원
5. 종료
====================
주문할 음료 : 2 (엔터)
주문 잔수 : 3 (엔터)
주문하신 아메리카노 3잔은 7500원 입니다.
*/
		
		Scanner sc = new Scanner(System.in);
		int a =2000;
		int b =2500;
		int c = 3000;
		int d = 3500;
		String x = "에스프레소";
		String y = "아메리카노";
		String z = "카푸치노";
		String l = "카페라떼";
		
		System.out.printf("=====Happy coffe MENU======\n");
		System.out.println("1.에스프레소는 2000원");
		System.out.println("2.아메리카노는 2500원");
		System.out.println("3.카푸치노 3000원");
		System.out.println("4.카페라떼 3500원");
		System.out.println("5.종료");
		int f = sc.nextInt();//음료 종류
		int g = sc.nextInt();//잔수
		
		if(f==1) {
			System.out.printf("주문하신%s %d잔은 %d원입니다",x,g,a*g);
		}else if(f==2) {
			System.out.printf("주문하신%s %d잔은 %d원입니다",y,g,b*g);
			
		}else if(f==3) {
			
			System.out.printf("주문하신%s %d잔은 %d원입니다",z,g,c*g);
		}else if(f==4) {
			System.out.printf("주문하신%s %d잔은 %d원입니다",l,g,d*g);
		}else  if(f==5) {
			System.out.println("종료");
		}
	}

}
