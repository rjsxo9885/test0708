package day12;

public class ArrayTest5 {
	
	private String bookName;
	private String author;
	
	public ArrayTest5() {}
	
	public ArrayTest5(String bookName,String author) {
		this.bookName = bookName;
		this.author = author;
	}
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void showBookInfo() {
		System.out.println(bookName+","+author);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayTest5[] library  = new ArrayTest5[5];
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		
		
		
		
		
	}

}
