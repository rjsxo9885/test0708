package day7;

public class test0706_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a =1; //¼ö
		
		int sum =0;
		int sum1 = 0;
		for(a=0; a<=100; a++) {
			 
			
			if(a%2==0) {
				sum = sum+a;
				
			}
			else if(a%2!=0) {
				
				sum1 = sum1 +a;
			}
			
		}
		System.out.println(sum);
		
		System.out.println(sum1);
		
		System.out.println(sum1+sum);
		
	}

}
