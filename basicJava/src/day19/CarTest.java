package day19;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("===���� �����ϴ� �ڵ���=====");
			Car myCar = new AIcar();
			myCar.run();
			
			System.out.println("====����� �����ϴ� �ڵ���=====");
			Car hisCar = new ManualCar();
			hisCar.run();
	}

}
