package day19;

	interface Father{ 
		public void printFather();
	}
	interface Mather{
		public void printMather();
	}
	
	
	class Son implements Father,Mather{
		@Override
		
		public void printMather() {
			System.out.println("����");
		}
		public void printFather() {
			
			System.out.println("�ƺ�");
		}
		
		
		
		
		
	}

public class InterfaceTest3 {

	public static void main(String[] args) {
		// �������̽��� Ŭ������ ��� �� ����
		// �������̽� :���� imp
		// �߻�Ŭ���� : ��� extends 
		// Java�� �ܵ� ��Ӹ� �����ϴ�.
		//		�θ�Ŭ���� : �ڽ�Ŭ���� = 1:1
		//���� ������ �����ϴ�.
		
		Son fa = new Son();
		fa.printFather();
		
		Son ma = new Son();
		
		ma.printMather();
	}

}
