package study;

public class GeneralizationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus(100);
		bus.take(1300);
		bus.showBusInfo();
		
		//
		Subway sub = new Subway("2È£¼±");
		sub.take(1250);
		sub.showSubwayInfo();
		
	}

}
