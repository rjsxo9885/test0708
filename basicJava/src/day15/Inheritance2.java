package day15;
//ObjectŬ������ ��� Ŭ������ ����Ŭ�����̴�.
//				�ڹ�Ŭ���� ���� ������ �ֻ��� ��ġ
//				java.lang ��Ű���� ����
class korea{
	public void korea() {
		System.out.println("Korea()..");
	}
}
class Seoul extends korea{
	//super();
	public void Seoul(){
		System.out.println("Seoul()....");
	}
}
class Guro extends Seoul{
	//super();  //����
	//:�θ� ������ �Լ� �ڵ� ȣ�� �޼ҵ�
	public void Guro() {
		System.out.println("Guro()...");
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		// ��Ӱ��迡�� ������ȣ�� ����
		//(�ڽ�Ŭ����_��ü)���� �θ� �����ڸ� ȣ���ϰ� ,�ڽ��� �����ڸ� ȣ���Ѵ�
		
		//"�ڽ�" ��ü ����
		
		Seoul se = new Seoul();
		se.Seoul();
	}

}
