package study;
import java.util.Scanner;

public class JavaEx014 {

	public static int vo(int a) {
		int b =1;
		if(a%2==0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		if(vo(c)==1) {
			System.out.println("¦���Դϴ�");
		}else {
			System.out.println("Ȧ���Դϴ�");
		}
		
		
		
	}

}
