package study;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order si;
		si = new Order();
		
		
		/*long number;
		String year ;
		String id ;
		String name ;
		String number1; //상품번호
		String si; //주소*/
		
		
		si.Orderset("201803120001", "2018년3월 12일", "abc123", "방건태", "PD0345-12", "서울시 영등포구 여의도동 20번지");
		si.disp();
		
		
	}

}
