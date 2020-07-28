package day19;

	interface AdderInterface{
		
		
		 int add(int x, int y);       // x�� y�� �� ��ȯ
		 int add(int n);              // 1���� n������ ���� �� ��ȯ(��, n > 0)
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
