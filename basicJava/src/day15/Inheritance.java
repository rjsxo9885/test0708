package day15;
//���̺귯��Ŭ����

class AA{
	public void one() {
		System.out.println("AAŬ������ one()...");
	}
	public void two() {
		System.out.println("AAŬ������ two()....");
	}
	//�ڽ�Ŭ����      �θ�Ŭ����
	
}//AA class-end
class BB extends AA{
	public void three(){
		System.out.println("BBŬ������ three()");
	}
	
}//bbŬ���� ����
class CC extends BB{
      public void four() {
    	  System.out.println("CCŬ������ four()");
      }
}
class DD extends CC{
	public void five() {
		System.out.println("DDŬ������ five");
	}
}

 
public class Inheritance { //���� Ŭ����(main()�޼ҵ尡�����ϴ� Ŭ����)

	public static void main(String[] args) {
		// (��)class ���� ���:���� ���,���߻��
		//interface���� ���
		//���:����,�θ�,�⺻
		//	  ����,�ڽ�,�Ļ�
		
		AA a1 = new AA();
		a1.one();
		a1.two();
		
		BB b1 = new BB();
		b1.one();
		b1.two();
		b1.three();
		
		CC c1 = new CC();
		
		c1.one();
		c1.two();
		c1.three();
		c1.four();
		
		DD d1 = new DD();
		
		d1.one();
		d1.two();
		d1.three();
		d1.four();
		d1.five();
		
	}

}
