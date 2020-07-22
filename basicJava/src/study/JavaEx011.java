package study;
import java.util.Scanner;
class Gugu{
	public void Gugu(int inputNum) {
	
		
		System.out.println(inputNum+"단");
		
		for(int i=1; i<=9; i++) {
			System.out.println(inputNum+"*"+i+"="+(inputNum*i));
		}
		
	}
}







public class JavaEx011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		Gugu gugu = new Gugu();
		
		int a = sc.nextInt();
		
		  if(a>=2&&a<10) {
		
		   gugu.Gugu(a);
		  }else {
			  System.out.println("잘못입력하셧습니다");
		  }
		
		
		
	}

}
