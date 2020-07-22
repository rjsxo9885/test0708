package day15;
// 클래스 설계 --> 
public class Score {

	//필드
	private String name;
	private int kor,eng,math;
	//생성자
	//메소드
	
	public void set(String name,int kor,int eng,int  math) {
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.math=math;
	}
	
	public Score() {
		System.out.println("기본 생성자 다녀감");
		name = "이름없음"; 
		kor = 100;
		eng = 100;
		math = 100;
		
	}//consturctor-end
	//생성자 오버로딩(중복)
	//매개변수를 갖는 생성자
	public Score(String name) {
		this.name = name;
		kor = 100;
		eng = 100;
		math = 100;
	}
	public Score(String name,int kor,int  eng,int math) {
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.math=math;
	}
	public void disp() {
		System.out.println("name :"+name);
		System.out.println("kor :"+kor);
		System.out.println("eng :"+eng);
		System.out.println("math:"+math);
	}
	
	
	
	
}

