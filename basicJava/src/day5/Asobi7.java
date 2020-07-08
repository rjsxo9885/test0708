package day5;
import java.util.Scanner;
public class Asobi7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 중첩if 
	    // 국어, 영어, 수학 점수 입력받아,
		//총점과 평균 구한후 
		//평균 90 점 이상 A
		//평균80점 이상B
		//평균70점 이상 C
		//평균 70점 미만 F
	System.out.println("====성적처리 프로그램====");	
	Scanner input= new Scanner(System.in); //입력받아야 하니 Scanne
	System.out.println("국어:");
	int kor = input.nextInt();
	System.out.println("수학:");
	int math = input.nextInt();
	System.out.println("영어:");
	int eng = input.nextInt();

	
	
	int total= kor+ eng+ math;
	int avg= (kor+eng+math)/3;
	
	if(avg>=95) {
		System.out.println("장학생");
		
	}
	System.out.println("총점:300");
	System.out.println("평균:100");
	
		if (avg>=60) {
		System.out.println("합격");
		}
		
		else if (kor>=40|eng>=40| math>=40)
			System.out.println("재시험");

	}
}

