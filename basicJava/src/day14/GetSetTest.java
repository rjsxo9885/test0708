package day14;

class Login{
	//1.�ʵ�,��� ����
	private String id;
	private String password;
	private String userName;
	//2.������
	public Login() {
		//3.�޼ҵ� .����Լ�
	}
	public String getid() {
		return id;
	}
	public void setid(String id) {
	//3 .�޼ҵ� ,����Լ�
		//private ��������� setter/getter
		
		this.id = id; //������� = �Ű�����;
		
		
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
		//System.out.println(login.id); //����.private ��� �ܺ����� �Ұ���
		System.out.println(login.getid());
		System.out.println(login.getPassword());
		System.out.println(login.getUserName());
		

	}

}
