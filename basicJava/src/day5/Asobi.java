package day5;
import java.util.Scanner;
public class Asobi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		 Scanner ab = new Scanner(System.in);
	        int a,b;
	        System.out.println("ù��° ���ڸ� �Է��Ͻÿ�");
	        a = ab.nextInt();
	        System.out.println("�ι�° ���ڸ� �Է��Ͻÿ�");
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
