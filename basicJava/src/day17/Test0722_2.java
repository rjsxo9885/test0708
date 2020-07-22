package day17;

import java.util.Scanner;

class RandomDice1{
	public int Dice() {
		
		return (int)(Math.random()*3+1);
	}
	
}

public class Test0722_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDice1 dice1 = new RandomDice1();
		
		Scanner sc = new Scanner(System.in);
	
		int [] b = new int[10];
		int count = 0;
		int [] c = new int [6];
		
		for(int j=0; j<6; j++) {
			c[j]=dice1.Dice();
			count =0;
			for(int i=0; i<10; i++) {
			b[i]=dice1.Dice();
			 if(c[j]==b[i]) {
	        	 count ++;
			}
		
		
		
			
		
		}
		
		 System.out.printf("첫 주사위값:%d %d회 : %d\n",c[j],j+1,count);
		
	}
	}

}
