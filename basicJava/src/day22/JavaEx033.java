package day22;

public class JavaEx033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  try {
			  String s = "12.3";
			  int n = Integer.parseInt(s);
			  n ++;
			  System.out.println(n);
			  
		  }catch(Exception e) {
			  
			  System.out.println(e+"�� ������ ��ȯ �� �� �����ϴ�.");
		  }finally{
			  System.out.println("����� �����ϴ�");
		  }
		
		
	}

}
