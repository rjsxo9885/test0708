package day17;

class Pizza{
	String topping;
	public static int count;
	//private static int count;
	
	public  Pizza(String topping) {
		this.topping = topping;
		count ++;
	}
	
	

	
	/*public static int getCount() {
		return count;
	}




	public static void setCount(int count) {
		Pizza.count = count;
	}
*/

	
	
	
	 
}









public class JavaEx023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Pizza p1 = new Pizza("슈퍼스프림");
			Pizza p2 = new Pizza("치즈");
			Pizza p3 = new Pizza("페퍼로니");
			int n = Pizza.count;
			
			System.out.println(n);
		
			
			
		
		
	}

}
