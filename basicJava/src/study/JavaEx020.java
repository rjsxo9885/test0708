package study;

class Circle{
	
	private int x,y;
	private int r;
	public Circle(int x, int y,int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public int getgaRo() {
		return x;
	}
	public void setgaRo() {
		this.x = x;
	}
	public int getseRo() {
		return y;
	}
	public void setseRo() {
		this.y = x;
	}
	public int getRadiance() {
		return r;
	}
	public void setRadiance() {
		this.r= r;
	}

	
	public void Area() {
		
		System.out.println("�� ���� ���̴� "+((r*r)*3.14)+"�Դϴ�");
		System.out.printf("��ǥ�� : (%d,%d)",x,y);
		
	}
	
	
	
}










public class JavaEx020 {
	public static void main(String[] args) {
		
		
		
		Circle cr = new Circle(3,4,2);
		
		cr.Area();
		
		
		
		
		
}
}