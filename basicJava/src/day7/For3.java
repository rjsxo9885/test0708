package day7;

public class For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1)중처for: 사각형(5x5)별(*) 출력
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.printf("*");
			}
			System.out.println("*");	
		}
		int a= 1;
		int b= 1;
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				
				a  =  a+1;
				System.out.printf("%4d",a);
				
			}
			
		
			System.out.println();	
			
		}
		
	}

}
