package study;

public class Taxi {
	String taxicolor;
	int passengerCount;
	int money;
	
	public Taxi(String taxicolor) {
		this.taxicolor = taxicolor;
	}
	
	public void take(int money) {
	this.money +=money;
	passengerCount++;
	}
	public void showTaxiInfo() {
		System.out.println(taxicolor+"�� �ý��� �°���"+passengerCount+"���̰�,������"
+money+"�Դϴ�");
	}
}
