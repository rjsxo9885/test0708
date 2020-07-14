package day11;

import java.util.Scanner;

public class Methode7 {
	
	
	public static void mingab(int a,int b) {
		int gab =0;
		
		if(a>b) {
			gab = b;
		}else if(b>a) {
			gab = a;
		}else if(a==b) {
			gab = a;
		}
		System.out.println(gab);
	}
	public static void maxgab(int a,int b) {
		int gab =0;
		
		if(a>b) {
			gab =a;
		}else if(b>a){
			gab = b;
		}else if(a==b) {
			gab =a;
		}
		System.out.println(gab);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		mingab(3,4);
		maxgab(4,5);
	}

}
