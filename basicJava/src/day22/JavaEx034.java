package day22;
import java.util.Scanner;
public class JavaEx034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int n;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+">>");
		try {
			
				
				n = sc.nextInt();
				
		}catch(Exception e){
			
			n = dasi();
		}finally {
			System.out.println("끝");
		}
		
		sum +=n;
		
	}
		System.out.println("정수 3개의 합은"+sum+"입니다");
		
		
		
		
		
	}
	
	    static int  dasi() {
			int n=0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("다시입력하세요");
			 n=  sc.nextInt();
			
			}catch(Exception e) {
				 n = dasi();
			}
			sc.reset();
		return n;
		
	}
}




