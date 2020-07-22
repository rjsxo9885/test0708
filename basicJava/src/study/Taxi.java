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
		System.out.println(taxicolor+"색 택시의 승객은"+passengerCount+"명이고,수입은"
+money+"입니다");
	}
}
