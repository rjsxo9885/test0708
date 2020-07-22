package day12;


class Sunjuk{
	int kor,eng,math;
	
	int avg;
	
	public void tensu(int a,int b,int c) {
		
		
		kor = a;
		eng = b;
		math = c;
		
	}
	
	public void init(int a,int b,int c) {
		
	}
	
	public void calc() {
		avg = (kor+eng+math)/3;
	}
	public void disp() {
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		System.out.println(avg);
	}
}

public class ClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sunjuk nl = new Sunjuk();
		nl.tensu(100,90,80);
		nl.calc();
		System.out.println(nl.kor);
		System.out.println(nl.eng);
		System.out.println(nl.math);
		System.out.println(nl.avg);
		
		
	}

}
