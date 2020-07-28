package day20;

public class JavaEx029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[5];
		int total = 0;
	
		
		for(int i=0; i<5; i++) {
			num[i]= 2*i+2;;
			
			total +=num[i];
		}
			System.out.println(total);
		
 }
}