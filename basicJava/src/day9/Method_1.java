package day9;

public class Method_1 {
	
	//Ŭ����(class ) :field + method
	//�ɹ� ���� : �Ӽ�,�ʵ�s
	//�ɹ� �Լ� : �޼ҵ�s
	/*1.�޼ҵ� ����(����)
	 *2.�޼ҵ� ȣ��
	 * 	������
	 * 	public static ��ȯ�� �޼ҵ��(���μ�1,���μ�2,���μ�3.......){
	 *     ��ɹ�;
	 *     return ��ȯ��
	 *     }
	 *     
	 * 2.(�����  ����) �޼ҵ� ȣ��
	 * �޼ҵ��();
	 * �޼ҵ��(���μ�1, ���μ�2,���μ�3-----------);
	 */
	
	public static void test() {
		System.out.println("test() �޼ҵ� �Դٰ�!!");
	}
	public static void test1(int a){
		System.out.println(a);
	}
	public static void test2(double b) {
		System.out.println(b);
	}
	public static void test3(char a) {
		System.out.println(a);
	}
	public static void test4(String a) {
		System.out.println(a);
	}
	public static void test5(int a,int b) {

		System.out.println(a+b);
	}
	
	//test6�� ��� : �� �Ǽ��� ���޹޾� �Ǽ��� ���� ��ȯ
	public static double test6(double x,double y) {
		double z = x+y;
		return z;
	}
	public static void main(String[] args) { //�޼ҵ� ���
		// TODO Auto-generated method stub

		
		
		System.out.println("main()�޼ҵ� :���α׷��� ����"); // �޼ҵ� �ٵ�
		
		test();//�޼��� ȣ�⹮ : CALL
		test1(10);
		test2(3.14);
		test3('A');
		test4("hi");
		test5(10,20);
		test6(3.14,3.3);
		System.out.println("test()�޼ҵ� ȣ���� ���ƿ�!!");
		System.out.println("main()�޼ҵ�: ���α׷� ������ ��!");
		
		
	}//main end

}//class end
