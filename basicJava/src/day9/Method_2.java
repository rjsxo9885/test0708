package day9;

public class Method_2 {

	public static int add(int a, int b) {
		return a+b;
	}
	public static int min(int a,int b) {
		return a-b;
	}
	public static int mul(int a,int b) {
		return a*b;
	}
	public static int div(int x, int y,int z) {
	if(y==0) {
		System.out.println("나누는 수는 0이 될수 없습니다");
		return  -999;
		
	}else
		 z = x/y;
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = add(10,2);
		int n2 = min(10,2);
		int n3 = mul(10,2);
		
		
		System.out.println("10+2:"+n1);
		System.out.println("10-2:"+n2);
		System.out.println("10*2:"+n3);
	
	
		
	}

}
