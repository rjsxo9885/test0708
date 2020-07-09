package day10;

public class Exercisech402 {

	public static long fact(int a) {
		long fac = 1;
		for(int n =a; n>=1;n--) {
			fac *=n;
			
		}
		return fac;
	}
	public static long fact1(int num) {
		if(num ==0)
			return 1;
		else
			return num*fact1(num-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//팩토리얼 : 3! =3*2*1;
			//1. 입력
			//2.처리	
			//3.출력
		int num =4;
		long result = fact(num);
		long reultt  = fact1(num);
		System.out.println(num+"!:"+result);
		System.out.println(reultt);
		
		
	}

}
