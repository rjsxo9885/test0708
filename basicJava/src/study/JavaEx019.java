package study;

class Sum{
	int x,y,z;
	
	public int Sum2(int x,int y) {
		this.x = x;
		this.y = y;
		
		return (x+y);
	}
	public int Sum3(int x,int y,int z) {
		this.x =x;
		this.y =y;
		this.z =z;
		
		return (x+y+z);
	}
	
	
}







public class JavaEx019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sum sum = new Sum();
		
		sum.Sum2(10, 20);
		sum.Sum3(10, 20,30);
		
		System.out.println(sum.Sum2(10, 20));
		System.out.println(sum.Sum3(10, 20,30));
		
		
		
		
	}

}
