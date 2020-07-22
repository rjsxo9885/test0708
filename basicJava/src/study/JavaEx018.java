package study;

class Point {
	private int x,y;
	
	public void  XY(int x,int y) {
		this.x = x;
		this.y = y;
		
	}
	public void Point() {
		System.out.printf("x,y =(%d,%d)",x,y);
	}
	
}



public class JavaEx018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point po = new Point();
		
		po.XY(1,2);
		
		po.Point();
		
		
		
		
		
		
		
	}

}
