package day2;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor = 100;
		int eng = 70;
		int math = 80;
		int total = kor+eng+math;
		double evg =  (double)total/3;
		
		System.out.printf("������� %d,������� %d ���м����� %d �Դϴ�\n",kor,eng,math);
		System.out.printf("���� ������ %d�Դϴ�\n",total);
		System.out.printf("����� %.2f�Դϴ�",evg);
	}

}
