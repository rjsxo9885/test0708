package day6;
import java.util.Scanner;
public class if5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int season =sc.nextInt();
		if(season ==1) {
			System.out.println("봄");
		}else if(season==2) {
			System.out.println("여름");
		}else if(season==3) {
			System.out.println("가을");
		}else if(season==4) {
			System.out.println("겨울");
		}else {
			System.out.println("잘못입력했습니다");
		}
		
		/*
		 * 
		 * 
		 */
	}

}
