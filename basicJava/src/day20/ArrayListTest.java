package day20;

import java.util.ArrayList;

import day21.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book lib = new Book();
		
		Book[] lib2 = new Book[100];
		lib2[0] = new Book("�¹���","������");
		System.out.println(lib2.length);
	
		ArrayList<Book> library = new ArrayList<Book>();
		library.add(new Book("�¹���","������"));
		
		
		library.add(new Book("���̾�","�츣��"));
		library.add(new Book("��� ����ΰ�","���ù�"));
		
		library.add(new Book("����","�ڰ渮"));
		library.add(new Book("�����","�������丮"));
		System.out.println(library.size());
		
		
		for(int i=0; i<library.size(); i++) {
			System.out.println(library.get(i));
		}
		
		for(int i=0; i<library.size(); i++) {
			
			Book book = library.get(i);
			book.showBookInfo();
			
		}
		
		System.out.println();
		
		System.out.println("���� for�� ���" );
				for(Book book : library) {
					book.showBookInfo();
				}
		
	}

}
