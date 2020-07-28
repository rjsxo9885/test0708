package day19;

public abstract class Car {		//추상 클래스
	public abstract void drive(); //추상 메소드
	public abstract void stop(); //추상 메소드
	

public void startCar() {		
	System.out.println("시동을  겹니다");
}
public void turnOff() {
	
	System.out.println("시동을 끕니다");
}

final public void run() {
	startCar();
	drive();
	stop();
	turnOff();
}
}