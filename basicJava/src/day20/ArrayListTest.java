package day20;

import java.util.ArrayList;

import day21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book lib = new Book();
		
		Book[] lib2 = new Book[100];
		lib2[0] = new Book("태백산맥","조정래");
		System.out.println(lib2.length);
	
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("태백산맥","조정래"));
		
		
		library.add(new Book("데이안","헤르만"));
		library.add(new Book("어떻게 살것인가","유시민"));
		
		library.add(new Book("토지","박경리"));
		library.add(new Book("어린왕자","생텍쥐페리"));
		System.out.println(library.size());
		
		
		for(int i=0; i<library.size(); i++) {
			System.out.println(library.get(i));
		}
		
		for(int i=0; i<library.size(); i++) {
			
			Book book = library.get(i);
			book.showBookInfo();
			
		}
		
		System.out.println();
		
		System.out.println("향상된 for문 사용" );
				for(Book book : library) {
					book.showBookInfo();
				}
		
	}

}
