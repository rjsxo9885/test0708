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
		
		System.out.println("=====컴퓨터와 가위 바위 보 ============");
		while(true) {
			System.out.println("가위(0), 바위(1), 보(2), 종료(3) :");
			a = sc.nextInt();
			b = dice.Dice();
			if(b==0) {
				System.out.println("컴퓨터는 가위를 냈습니다");
			}else if(b==1) {
				System.out.println("컴퓨터는 바위를 냈습니다");
				
			}else if(b==2) {
				System.out.println("컴퓨터는 보를 냈습니다");
			}
			
			if(a==0) {
				if(b==0) {
					System.out.println("무승부입니다.");
				}else if(b==1) {
					System.out.println("컴퓨터가 이겼습니다");
				}else if(b==2) {
					System.out.println("당신의 승리입니다.");
				}
			}
			
			if(a==1) {//바위
				if(b==0) {
					System.out.println("당신의 승리입니다.");
				}else if(b==1) {
					System.out.println("무승부입니다");
				}else if(b==2) {
					System.out.println("컴퓨터가 이겼습니다");
				}
			}
			
			if(a==2) {
				if(b==0) {
					System.out.println("컴퓨터가 이겼습니다");
				}else if(b==1) {
					System.out.println("당신의 승리입니다");
				}else if(b==2) {
					System.out.println("무승부입니다");
				}
			}
			
			if(a==3) {
				System.out.println("종료");
				
				break;
			}
			
			
		}
		
		
		
	}

}
