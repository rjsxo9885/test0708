package study;



public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentJames = new Student("JAMES",5000);
		Student studentTomas = new Student("TOMAS",10000);
		Student studenttaki = new Student("taki",100000);
		
		
		Bus bus100 = new Bus(100);
		studentJames.takeBus(bus100);
		studentJames.snowInfo();
		bus100.showBusInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.snowInfo();
		subwayGreen.showSubwayInfo();
		
		Taxi taxi1 = new Taxi("노란색");
		studenttaki.takeTaxi(taxi1);
		studenttaki.snowInfo();
		taxi1.showTaxiInfo();
		
		
		
	
		
	}

}
