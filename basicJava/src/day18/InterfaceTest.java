package day18;

 interface Animal{
	
	//�߻� �ż��常 ����
	abstract void kind();
	void breathe();
}
 
  class Elephant implements Animal{
	 @Override
	 
	  public void kind() {
		 System.out.println("������");
	 }
	 
	 @Override
	 
	 public void breathe() {
		 System.out.println("���ķ� ȣ����");
	 }
 }
 class Fish implements Animal{
	 
	 @Override
	 public void breathe() {
		 System.out.println("�ư��̷� ȣ����");
	 }
	 
	 
 }





public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//�������̽�
				//�߻�Ŭ������  ���,�߻�Ŭ�������� �߻�ȭ ������ �� ����.
				//(�Ϲ�)�ʵ��(�Ϲ�)�޼��带 ���� ����
				//�߻�żҵ� "��"  ����
				//�������̽��� �ݵ�� Ŭ�������� �߻�޼ҵ带 �������̵� �ؾ߸� �Ѵ�.
				//(����) --> ���� --> (����)
		
		
		Animal ani = new Elephant();
		ani.kind();
		ani.breathe();
		
		ani = new Fish();
		ani.kind();
		ani.breathe();
		
	}

}
