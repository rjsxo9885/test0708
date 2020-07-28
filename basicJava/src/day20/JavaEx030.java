package day20;
import java.util.*;
public class JavaEx030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int [] num = new int[5];
		int c = 0;
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2 ==0) {
				num[c]=i;	
				sum+=num[c];
				c++;
					
			}

			
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
		System.out.println(sum);

		
	}

}
