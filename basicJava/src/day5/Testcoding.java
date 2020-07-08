package day5;
import java.util.Scanner;



public class Testcoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count =0;
		Scanner sc = new Scanner(System.in);
		String ex;
		
		ex = sc.next();
		int a = sc.nextInt();
		
		for(int i=0; i<ex.length(); i++) {
			if(ex.charAt(i)=='R') count++;
		}
		
		
		if(count == a) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
					
		
		
	}

}
