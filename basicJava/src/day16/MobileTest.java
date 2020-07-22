package day16;
import java.util.Scanner;

class Abc{//충전 하는 매서드 
	private String mobileName,osType;
	private int batterySize;
	
	public Abc(String mobileName,String osType,int batterySize) {
		this.mobileName =mobileName;
		this.osType = osType;
		this.batterySize = batterySize;
	}
	
	public Abc() {
		System.out.println("기본값");
		mobileName = "이름없음";
		osType = "노멀타입";
		batterySize = 100;
	}
	
	public String getmobileName() {
		return mobileName;
	}
	public void setmobileName() {
		this.mobileName= mobileName;
	}
	public String getosType() {
		return osType;
	}
	public void setosType() {
		this.osType = osType;
	}
	public int getbatterySize() {
		return batterySize;
	}
	public void setbatterySize() {
		this.batterySize = batterySize;
	}
	
	public int operate(int time) {
		return batterySize -=time*12;
	}
	
	public int charge(int time) {
		return batterySize += time*8;
	}
	
	public void ShowInfo() {
		System.out.printf("Type : %s Battery %d os %s ",mobileName,batterySize,osType);
	}
	
}

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
			Abc ab = new Abc("Iphone","IOS",100);
			boolean shiyou ;
			System.out.println("==============================");
			System.out.println("베터리 충전 ,사용시간 표시 서비스");
			System.out.println("1.사용시간 || 2. 충전시간 || 3. 현재 잔량 || 4. 종료");
			while(true) {
				int i = sc.nextInt();
					if(i==1) {
						System.out.println("사용시간을 입력하시오");
						int b = sc.nextInt();
						ab.operate(b);
						System.out.printf("사용시간은 %d분 입니다",b);
					}else if(i==2) {
						System.out.println("충전 시간을 입력하시오");
						int b = sc.nextInt();
						ab.charge(b);
						System.out.printf("충전 시간은 %d분 입니다",b);
					}else if(i == 3) {
						ab.ShowInfo();
					}else if(i==4) {
						System.out.println("종료");
						break;
					}
			
			}
			
	}

}
