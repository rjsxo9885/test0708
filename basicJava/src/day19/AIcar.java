package day19;

			//(자식)			(부모) 추상클래스
public class AIcar extends Car{
	@Override
	
	public void  drive() {
		System.out.println("차가 자율주행합니다");
		System.out.println("자동차가 알아서방향을 조정합니다");
	}
	
	@Override
	
	public void stop() {
		System.out.println("차가 스스로 멈춥니다");
	}
	
}
