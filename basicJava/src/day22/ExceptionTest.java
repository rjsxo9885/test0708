package day22;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		System.out.println(3/0);
//		System.out.println("END");
//		
//		int x =3;
//		int y= 0;
//		if(y==0) {
//			
//			System.out.println("0���� ������ �����ϴ�");
//		}
//		else {
//			System.out.println(x/y);
//		}
		
		
		
		
		try {// ���ܰ� ����Ǵ� �ڵ带 �ۼ�
			System.out.println(1);
			System.out.println(5/1);
			System.out.println(3/0);
			System.out.println(5);
		}catch(Exception e) {
			System.out.println(e);
		}//���࿡ ���ܰ� �߻��Ѵٸ� ����Ǵ� �ڵ�
		System.out.println("END");
		
		
		try {
			System.out.println("====================");
			int [] su = new int[3];
			su[3]= 100;
			System.out.println("----------------------");
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("END");
		}
	}
	
	
	

}
