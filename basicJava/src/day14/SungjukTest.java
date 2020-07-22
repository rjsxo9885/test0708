package day14;

public class SungjukTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Sungjuk s1 ; //참조형 변수 s1
		s1 = new Sungjuk(); //객체(heap memory) 생성
		
		
		System.out.println(s1.kor+s1.eng+s1.math);
		s1.name = "김길동";
		s1.math = 90;
		s1.eng = 80;
		s1.kor =100;
		s1.calc();
		s1.disp();
		
		
		Sungjuk s2  = new Sungjuk();
		s2.name = "홍길동";
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
		s1 = s2;		//객체복사:참조(레퍼런스)변수의 주소값 복사
		
		s1.disp();
		s2.disp();
		
	}

}
