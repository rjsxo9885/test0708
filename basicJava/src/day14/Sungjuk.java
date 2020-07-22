package day14;

public class Sungjuk {

	
	String name;
	int kor,eng,math;
	private int avg;
	
	public void calc() {
		 avg = (kor+eng+math)/3;
		
	}
	
	public void disp() {
		System.out.println("name :"+name);
		System.out.println("math :"+math);
		System.out.println("eng  :"+eng);
		System.out.println("kor :"+kor);
		System.out.println("evg :"+avg);
		
		
	}
	
	
	
}
