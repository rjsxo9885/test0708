package day21;
import day21.WebProgram.Language;
import day21.WebProgram.Smart;

class WebProgram{
	String title = "Java Programming";
	
	class Language{
		String basic= "Java,HTML,JavaScript";
		void display() {
			System.out.println("����  ����"+basic);
		}
	}
	
	class Smart{
		String basic = "Objective-C,Mac-Os";
		void display() {
			System.out.println("����  ����"+basic);
		}
		
	}
	void print() {
		Language lang = new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}

}


public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebProgram web = new WebProgram();
		web.print();
		
		
		WebProgram.Language lang = new WebProgram().new Language();
		lang.display();
		
		WebProgram.Smart sm = new WebProgram().new Smart();
		sm.display();
		
		
		/*
		 * inner ����Ŭ���� 
		 * Ŭ���� �ȿ� Ŭ������ �ִ°��
		 * �ܺο��� ������ �ʿ䰡 ���� Ŭ����
		 * GUI ���ø����̼���(AWT,SWING)
		 * �̺�Ʈ (���콺 Ŭ��,���콺 ����, Ű���崭������ ...)ó���� ���� ���
		 * ��)�ڹٽ�Ʈ��Ʈ --->jQuery,Ajax
		 * 
		 */
	}

}
