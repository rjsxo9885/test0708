package study;

public class JavaEx010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][]a= new int[5][5];
		int count =1;
		for(int i=0; i<=4; i++) {
			for(int j=0; j<=4; j++) {
				a[i][j]=count++;
			}
			
		}
		
		for(int i = 0; i < 5; i++) {
			int temp = 0;
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3d", a[i][j]);
				temp += a[i][j];
				
			
		}
			
			System.out.println("  "+temp);
			
	}
		int temp3 =0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				temp3+=a[j][i];
			}
			System.out.printf(" %d",temp3);
		}
		

}
}