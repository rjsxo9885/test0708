package day23;

class Test{
//	void view() {
//		try {
//			int a = 3/0;
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//	
//	void disp() {
//		try {
//			Integer in = null;
//			int a = in.intValue();
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//	}
	
	//2)
	
	void view() throws Exception{
		int a = 3/0;		//���װ� ���ܰ� �߻��Ѵٸ� �ڽ��� ȣ���Ѱ����� ����������
	}
	void disp() throws Exception{
		Integer in = null;
		int a = in.intValue();
	}
	
}


public class ExceptionTest2 {
	//����ó��
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(1/0);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("END");
		}
		Test test = new Test();
		test.view();
		test.disp();
		
		
		//2)
		
		try {
			System.out.println("OPEN");
			test.view();
			test.disp();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("END");
		}
		
	}
	
	//throw��

}
