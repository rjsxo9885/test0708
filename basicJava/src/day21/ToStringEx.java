package day21;

class Book extends Object{
	int bookNumber;
	String bookTitle;
	
	 Book(int bookNumber,String bookTitle ) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	 @Override
	 public String toString() {
		 return bookTitle +","+bookNumber;
	 }
	public void disp() {
		System.out.println(bookTitle+""+bookNumber);
	}
	
}


public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book book1 = new Book(200,"����");
			book1.disp();
			System.out.println(book1);
			System.out.println(book1.toString());
	}

}
