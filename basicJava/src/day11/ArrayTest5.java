package day11;

import java.util.Scanner;

public class ArrayTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//버블정렬 : 오름차순 (작 ->큰)
		Scanner sc= new Scanner(System.in);
		int temp = 0;
		int [] a= new int[] {20,80,70,60,100};
		
		for (int i =0;i<a.length;i++) {
			
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					
					temp= a[i];
					a[i] = a[j];
					a[j]= temp;
					
					
				}else {
					continue;
				}
			}
			System.out.printf("%d ",a[i]);
		}
		
		
		
	}
	public void bubbleSort(int[] array) {
	    int size = array.length;
	     
	    for(int i=0; i < size-1; i++) {
	        System.out.printf("\n버블 정렬 %d 단계 : ", i + 1);
	        for(int j=0; j < size -1 -i; j++) {
	            if(array[j] > array[j+1])
	                swap(array, j, j+1);
	            System.out.printf("\n");
	            for(int k=0; k < size; k++) {
	                System.out.printf("%4d", array[k]);
	            }
	        }
	    }
	}
	 
	public void swap(int[] array, int i, int j) {
	    int temp = array[i];
	    array[i] = array[j];
	    array[j] = temp;
	}

}

