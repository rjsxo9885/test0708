package study;
import java.util.Scanner;
class Sign{
	public void Sigh(int inputNum){
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		if(inputNum>0) {
			inputNum = 1;
			System.out.println(inputNum);
		}else {
			inputNum = 0;
			System.out.println(inputNum);
		}
		
	}
	
	
}




public class JavaEx012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		Sign sign = new Sign();
		
		sign.Sigh(a);
		
		
		
		
	}

}
