package day21;
import day21.WebProgram.Language;
import day21.WebProgram.Smart;

class WebProgram{
	String title = "Java Programming";
	
	class Language{
		String basic= "Java,HTML,JavaScript";
		void display() {
			System.out.println("기초  수업"+basic);
		}
	}
	
	class Smart{
		String basic = "Objective-C,Mac-Os";
		void display() {
			System.out.println("기초  수업"+basic);
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
		 * inner 내부클래스 
		 * 클래스 안에 클래스가 있는경우
		 * 외부에서 접근할 필요가 없는 클래스
		 * GUI 어플리케이션의(AWT,SWING)
		 * 이벤트 (마우스 클릭,마우스 오버, 키보드눌렀을때 ...)처리에 많이 사용
		 * 예)자바스트립트 --->jQuery,Ajax
		 * 
		 */
	}

}
