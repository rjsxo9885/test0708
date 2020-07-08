package day7;

public class For4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	
		for(int i=0;i<5; i++) {
			for(int j=4; j>i; j--) {
				System.out.printf("*");
			}
			System.out.println("*");
			
		}
		
	 System.out.println();
			int a = 6;
		
		
		for (int i=0; i<a; i++) {
            for (int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
        
       
		System.out.println();
    /*
		*
        **
        ***
        ****
        *****
        ******
                    */
	/*	int row= 5;
		 for (int i=0; i<row; i++) {
	            for (int j=i; j<row-1; j++)
	                System.out.print(" ");
	            for (int k=0; k<=(i*2); k++)
	                System.out.print("*");
	            System.out.println("");
	        }

      */     
		 for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print("-");
            }
            for(int k=1;k<=(i*2)-1;k++){
                System.out.print("*");
            }
            System.out.println();
            
            
        }
		
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<i;j++) 
				System.out.print("-"); 
			for(int j=(6-i)*2-1;j>0;j--)
				System.out.print("*"); 
			System.out.println();
		}



		
		
		

	


  

}
}
