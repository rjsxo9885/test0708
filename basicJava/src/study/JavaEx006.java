package study;

import java.util.Scanner;

public class JavaEx006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 문제6]
문자 하나와 정수 숫자 하나를 입력 받아 
입력한 문자를 숫자만큼 반복출력하세요.

[결과]
문자 하나 입력 : # (엔터)
숫자(양수)입력 : 5 (엔터)
#####
 */
		Scanner sc = new Scanner(System.in);
		
		String a= sc.next();
		int b= sc.nextInt();
		
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
		
	}

}
