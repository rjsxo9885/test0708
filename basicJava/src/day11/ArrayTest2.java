package day11;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//���α׷��� �⺻ �˰��� : �ּڰ�(min)�� �ִ�(max)
		
		Scanner sc = new Scanner(System.in);
		
		int gab []= new int[10];
		
		int []su = {7,3,1,8,6};
		int min=0;
		int size = su.length;
		int max=0;
		
		
		
		
		for(int idx=0; idx<size; idx++) {
			if(su[idx]>max) {
				max=su[idx];
			}else if(su[idx]<min||min==0) {
				min=su[idx];
			}
			
		}
		System.out.println(max);
		System.out.println(min);
		
		min=0;
		max= 0;
		int size1=gab.length;
		for(int idx=0; idx<size; idx++ ) {
			gab[idx]=sc.nextInt();
			
			if(gab[idx]>max) {
				max = gab[idx];
			}else if(gab[idx]<min||min==0){
				min=gab[idx];
			}
		}
		
		System.out.println("�ι�° �ּҰ�:"+min);
		System.out.println("�ι�° �ִ�:"+max);
		
		
		
	}

}
