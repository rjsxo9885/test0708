package day14;

public class SungjukTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Sungjuk s1 ; //������ ���� s1
		s1 = new Sungjuk(); //��ü(heap memory) ����
		
		
		System.out.println(s1.kor+s1.eng+s1.math);
		s1.name = "��浿";
		s1.math = 90;
		s1.eng = 80;
		s1.kor =100;
		s1.calc();
		s1.disp();
		
		
		Sungjuk s2  = new Sungjuk();
		s2.name = "ȫ�浿";
		s2.math = 80;
		s2.kor = 96;
		s2.eng = 79;
		s2.calc();
		s2.disp();
		/*
		s1.name = s2.name;
		s1.kor  = s2.kor;
		s1.math = s2.math;
		s1.eng = s2.eng;
		s1.calc();
		s1.disp();
						*/
		s1 = s2;		//��ü����:����(���۷���)������ �ּҰ� ����
		
		s1.disp();
		s2.disp();
		
	}

}
