package day18;

abstract class Parent{  //�ַ� �θ�Ȱ�� �Ѵ�
	
	String name = "�θ�";
	abstract void disp();		//�߻� �ż���
	void line() {}		//�Ϲ� �ż���
	
	
}

class Son extends Parent{
	
	@Override
	void disp() {
		System.out.println("�Ƶ��Դϴ�");
	}
}

class Daughter extends Parent{
	void disp() {
		System.out.println("���Դϴ�");
	}
}



public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//���� , �߻�Ŭ������ �ν��Ͻ�ȭ �Ұ���
		//Parent papa = new Parent();
			Son son  = new Son();
			son.disp();
			Daughter daugh = new Daughter();
			daugh.disp();
			//������
			Parent pa = new Son();
			pa.disp();
			pa = new Daughter();
			pa.disp();
			
			
	}

}
