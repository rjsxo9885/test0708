package day14;

class Login{
	//1.필드,멤버 변수
	private String id;
	private String password;
	private String userName;
	//2.생성자
	public Login() {
		//3.메소드 .멤버함수
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
	//3 .메소드 ,멤버함수
		//private 멤버변수의 setter/getter
		
		this.id = id; //멤버변수 = 매개변수;
		
		
		}
		public String getPassword() {
			return password;
		}
			
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
}


public class GetSetTest {

	public static void main(String[] args) {
		
		
		
		Login login = new Login();
		login.setid("abc111"); 
		login.setPassword("sonysega25");
		login.setUserName("bang gun tae");
		//System.out.println(login.id); //에러.private 멤버 외부접근 불가능
		System.out.println(login.getid());
		System.out.println(login.getPassword());
		System.out.println(login.getUserName());
		

	}

}
