package day19;

	interface AdderInterface{
		
		
		 int add(int x, int y);       // x와 y의 합 반환
		 int add(int n);              // 1에서 n까지의 정수 합 반환(단, n > 0)
	}
	
	class MyAdder implements AdderInterface{
		 @Override
		 public int add(int x, int y) {
			 return x+y;
		 }
		 @Override
		 public int add(int n) {
			 int sum = 0;
			 for(int i=0; i<=n; i++) {
				 sum+=i;
				 
			 }
			 return sum;
			 
		 }
		
		 
	}
	






public class JavaEx027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyAdder adder = new MyAdder();
		   System.out.println(adder.add(5, 10));
		   System.out.println(adder.add(10));
	}

}
