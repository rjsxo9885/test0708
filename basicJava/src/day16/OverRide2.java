package day16;
class School extends Object{
	public String name = "�б�";
	public void disp() {
		System.out.println(this.name);
	}
}

class MiddleSchool extends School{

	@Override	//annotation �ּ�
	public void disp() {
		System.out.println("����"+this.name);
//		super.disp(); // �θ�Ŭ������ �������� �����Ÿ� ���� ���� �ʾƵ���
//		���콺 ������ source���� �Է��ϴ� �� ����
	}	
}
class HighSchool extends School{
	public String name = "����б�";
	public void disp() {
		System.out.println("����"+this.name);
	}
}
public class OverRide2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MiddleSchool ms = new MiddleSchool();
		System.out.println(ms.name);
		ms.disp();
		
		HighSchool hs = new HighSchool();
		System.out.println(hs.name);
		hs.disp();
		
		
		
	}

}
