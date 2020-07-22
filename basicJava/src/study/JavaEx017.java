package study;

class Rect{
	private int garo,sero;
	
	public Rect(int garo,int sero) {
		this.garo =garo;
		this.sero =sero;
	}
	
	public int  getGaro() {
		return garo;
	}
	public void setGaro() {
		this.garo = garo;
	}
	public int  getSero() {
		return sero;
	}
	public void setSero() {
		this.sero = sero;
	}
	
	public void Rectdisp() {
		System.out.println("이 사각형의 넓이는 :"+(garo*sero));
		System.out.println("이 사각형의 둘레는 :"+(garo+sero)*2);
		
	}
}


public class JavaEx017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rect rect = new Rect(2,3);
		rect.Rectdisp();
		
		
		
		
	}

}
