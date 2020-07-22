package study;

import java.util.Scanner;

public class JavaEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int i =sc. nextInt();
		String a = "";
		
		switch(i) {
		case 1: a = "one"; break;
		case 2: a = "two"; break;
		case 3: a = "three"; break;
		
		default : a= "?"; break;
		}
		System.out.println(a);
		
		/*
		if(i == 1) System.out.println("one");
		else if(i == 2) System.out.println("two");
		else if(i == 3) System.out.println("three");
		else System.out.println("?"); */
	}

}
