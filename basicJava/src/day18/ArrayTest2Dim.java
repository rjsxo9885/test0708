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
			System.out.printf("%d�� %dȣ�� ��� �ο��� : %d\n",i+1,j+1,a[i][j]);
		
			}
		}
		System.out.printf("1�� �ο��� : %d\n",a[0][0]+a[0][1]);
		System.out.printf("2�� �ο��� : %d\n",a[1][0]+a[1][1]);
		System.out.printf("3�� �ο��� : %d\n",a[2][0]+a[2][1]);
		System.out.println("�� �ο��� : "+sum);
	}

}
