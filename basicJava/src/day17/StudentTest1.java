package day17;

public class StudentTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student();
		
		studentLee.setStudentName("�̱浿");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		System.out.println("----------------------------");
		Student studentSon = new Student();
		studentSon.setStudentName("�ձ浿");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++; 
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
		studentLee.serialNum--;
	}
/*
 * static  ���� :(�� ) ������ ���� ,Ŭ���� ����
 * JYM���� �ҽ� �ε��� , �޸� �Ҵ�
 * ���α׷� ����� �ּ� �ѹ��� �޷θ� �Ҵ� ����
 * �޸�  �ּҰ� ����
 * ���� ������ �ʿ��� ��ü�� ���,STATIC ��ü �������� �����ϸ� ó���ӵ��� ���� ��� 
 * ��ų��  �ִ�.
 * 2.static �޼ҵ�():Ŭ���� �Լ�
 */
}
