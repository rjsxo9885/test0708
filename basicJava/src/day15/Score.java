package day15;
// Ŭ���� ���� --> 
public class Score {

	//�ʵ�
	private String name;
	private int kor,eng,math;
	//������
	//�޼ҵ�
	
	public void set(String name,int kor,int eng,int  math) {
		this.name = name;
		this.kor = kor;
		this.eng =eng;
		this.math=math;
	}
	
	public Score() {
		System.out.println("�⺻ ������ �ٳన");
		name = "�̸�����"; 
		kor = 100;
		eng = 100;
		math = 100;
		
	}//consturctor-end
	//������ �����ε�(�ߺ�)
	//�Ű������� ���� ������
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

