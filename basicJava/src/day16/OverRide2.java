package day16;
class School extends Object{
	public String name = "학교";
	public void disp() {
		System.out.println(this.name);
	}
}

class MiddleSchool extends School{

	@Override	//annotation 주석
	public void disp() {
		System.out.println("구로"+this.name);
//		super.disp(); // 부모클래스를 가져오지 않을거면 굳이 넣지 않아도됨
//		마우스 오른쪽 source에서 입력하는 게 보통
	}	
}
class HighSchool extends School{
	public String name = "고등학교";
	public void disp() {
		System.out.println("구로"+this.name);
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
