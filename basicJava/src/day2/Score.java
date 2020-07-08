package day2;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 100;
		int eng = 70;
		int math = 80;
		int total = kor+eng+math;
		double evg =  (double)total/3;
		
		System.out.printf("국어성적은 %d,영어성적은 %d 수학성적은 %d 입니다\n",kor,eng,math);
		System.out.printf("종합 성적은 %d입니다\n",total);
		System.out.printf("평균은 %.2f입니다",evg);
	}

}
