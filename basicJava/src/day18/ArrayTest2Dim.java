package day18;

import java.util.Scanner;
public class ArrayTest2Dim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int [][] a = new int [3][2];
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
				
			
				a[i][j]= sc.nextInt();
				sum+=a[i][j];
			}
			
			
			
		}
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
			System.out.printf("%d類 %d�ˋ� 餌朝 檣錳熱 : %d\n",i+1,j+1,a[i][j]);
		
			}
		}
		System.out.printf("1類 檣錳熱 : %d\n",a[0][0]+a[0][1]);
		System.out.printf("2類 檣錳熱 : %d\n",a[1][0]+a[1][1]);
		System.out.printf("3類 檣錳熱 : %d\n",a[2][0]+a[2][1]);
		System.out.println("識 檣錳熱 : "+sum);
	}

}
