package day5;
import java.util.Scanner;
public class if4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//��ø if
			//���� ,����,�������� �Է¹޾�
			//������ �����������
			// ��������� 90�̻� 'A'
			// ��������� 80�̻��̸� 'B'
			//��������� 70���̻��̸� 'C'
			//��������� .....
		int sum;
		char grade = ' ';
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �Է��Ͻÿ�");
		int a = sc.nextInt();
		System.out.println("���м����� �Է��Ͻÿ�");
		int b = sc.nextInt();
		System.out.println("������� �Է��Ͻÿ�");
		int c = sc.nextInt();
		
		sum = a+b+c;
		int avg = (a+b+c)/3;
		System.out.println("������"+sum);
		System.out.println("���:"+avg);
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
			System.out.println("�����");
		}else if(avg>=60&&avg<=94) {
			System.out.println("�հ�");
		}else if(avg>=95) {
			System.out.println("���л�");
		}
	}

}
