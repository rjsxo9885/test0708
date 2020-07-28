package day19;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("===자율 주행하는 자동차=====");
			Car myCar = new AIcar();
			myCar.run();
			
			System.out.println("====사람이 주행하는 자동차=====");
			Car hisCar = new ManualCar();
			hisCar.run();
	}

}
