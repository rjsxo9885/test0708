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
			Pizza p1 = new Pizza("���۽�����");
			Pizza p2 = new Pizza("ġ��");
			Pizza p3 = new Pizza("���۷δ�");
			int n = Pizza.count;
			
			System.out.println(n);
		
			
			
		
		
	}

}
