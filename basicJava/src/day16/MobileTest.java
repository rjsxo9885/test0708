package day16;
import java.util.Scanner;

class Abc{//���� �ϴ� �ż��� 
	private String mobileName,osType;
	private int batterySize;
	
	public Abc(String mobileName,String osType,int batterySize) {
		this.mobileName =mobileName;
		this.osType = osType;
		this.batterySize = batterySize;
	}
	
	public Abc() {
		System.out.println("�⺻��");
		mobileName = "�̸�����";
		osType = "���Ÿ��";
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
			System.out.println("���͸� ���� ,���ð� ǥ�� ����");
			System.out.println("1.���ð� || 2. �����ð� || 3. ���� �ܷ� || 4. ����");
			while(true) {
				int i = sc.nextInt();
					if(i==1) {
						System.out.println("���ð��� �Է��Ͻÿ�");
						int b = sc.nextInt();
						ab.operate(b);
						System.out.printf("���ð��� %d�� �Դϴ�",b);
					}else if(i==2) {
						System.out.println("���� �ð��� �Է��Ͻÿ�");
						int b = sc.nextInt();
						ab.charge(b);
						System.out.printf("���� �ð��� %d�� �Դϴ�",b);
					}else if(i == 3) {
						ab.ShowInfo();
					}else if(i==4) {
						System.out.println("����");
						break;
					}
			
			}
			
	}

}
