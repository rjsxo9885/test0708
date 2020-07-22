package study;

class Boiler{
	
	private int temp;
	int a;
	public void  Set(int temp) {
		this.temp = temp;
	}
	
	public int getSet() {
		return temp;
	}
	
	public void setSet() {
		this.temp =temp;
	}
	
	public int tempup() {
		
		this.temp++;
		return temp;
		
	}
	public int  tempDown() {
		this.temp--;
		return temp;
	}
	 public int tempUp(int temp) {
		 this.temp+= temp;
		 return this.temp;
		 
	 }
}


public class JavaEx022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Boiler bo = new Boiler();
		bo.tempup();
		bo.tempDown();
		bo.tempDown();
		bo.tempup();
		bo.tempup();
		bo.tempup();
		
		System.out.println(bo.tempUp(20));
		
		
	}

}
