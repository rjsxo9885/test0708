package day5;
import java.util.Scanner;
public class Asobi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Scanner ab = new Scanner(System.in);
	        int a,b;
	        System.out.println("첫번째 숫자를 입력하시오");
	        a = ab.nextInt();
	        System.out.println("두번째 숫자를 입력하시오");
	        b = ab.nextInt();
	        
	        if((a%2)==0&&(b%2)==0){
	            System.out.println("NO");
	        }else if((a%2)==1&&(b%2)==1){
	            System.out.println("NO");
	        }else{
	            System.out.println("YES");
	        }
	    }
	
		
		
		
		
		
		
	
}
