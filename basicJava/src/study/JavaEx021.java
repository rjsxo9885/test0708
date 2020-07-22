package study;

class Emplyee{
	
	private int c; //이름 전화번호 연봉
	private String a,b;
	public Emplyee(String a,String b,int c) {
		
		this.a=a;
		this.b=b;
		this.c =c;
		
		
		
	}
	public Emplyee() {
		System.out.println("기본값");
		a ="이름없음";
		b = "010";
		c = 3000;
	}
	
	public String getName() {
		return a;
	}
	public void setName() {
		this.a=a;
		
	}
	public String getNumber() {
		return b;
	}
	public void setNumber() {
		this.b=b;
	}
	public int getDon() {
		return c;
		
	}
	public void setDon() {
		this.c=c;
	}
	
	public void show() {
		System.out.println("name :" +a);
		System.out.println("Number :"+b);
		System.out.println("연봉 : "+c);
		
	}
	
}







public class JavaEx021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplyee em = new Emplyee("방건태","010-5094-6807",3000);
		em.show();
		
		
		
	}

}
