package day19;

public abstract class Car {		//�߻� Ŭ����
	public abstract void drive(); //�߻� �޼ҵ�
	public abstract void stop(); //�߻� �޼ҵ�
	

public void startCar() {		
	System.out.println("�õ���  ��ϴ�");
}
public void turnOff() {
	
	System.out.println("�õ��� ���ϴ�");
}

final public void run() {
	startCar();
	drive();
	stop();
	turnOff();
}
}