package day5;
import java.util.Scanner;
public class if4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//중첩 if
			//국어 ,영어,수학점수 입력받아
			//총점과 평균을구한후
			// 평균점수가 90이상 'A'
			// 평균점수가 80이상이면 'B'
			//평균점수가 70점이상이면 'C'
			//평균점수가 .....
		int sum;
		char grade = ' ';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("국어성적을 입력하시오");
		int a = sc.nextInt();
		System.out.println("수학성적을 입력하시오");
		int b = sc.nextInt();
		System.out.println("영어성적을 입력하시오");
		int c = sc.nextInt();
		
		sum = a+b+c;
		int avg = (a+b+c)/3;
		System.out.println("총점은"+sum);
		System.out.println("평균:"+avg);
		if(avg>=90) {
			System.out.println(grade = 'A');
		}else if(avg>=80) {
			System.out.println(grade = 'B');;
		}else if(avg>=70) {
			System.out.println(grade = 'C');
		}else if(avg>=60) {
			System.out.println(grade = 'D');
		}else {
			System.out.println(grade = 'F');
		}
		
		if(a<40||b<40||c<40) {
			System.out.println("재시험");
		}else if(avg>=60&&avg<=94) {
			System.out.println("합격");
		}else if(avg>=95) {
			System.out.println("장학생");
		}
	}

}
