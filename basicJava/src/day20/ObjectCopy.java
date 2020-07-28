package day20;

import day21.Book;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book[] bookarray1 = new Book[3];
			Book[] bookarray2 = new Book[3];
			
			bookarray1[0] = new Book("태백산맥","조정래");
			bookarray1[1] = new Book("데미안","헤르만 헤세");
			bookarray1[2] = new Book("어떻게 살것인가","유시민");
			System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
			
			for(int i=0; i<bookarray2.length; i++) {
				bookarray2[i].showBookInfo();
			}
			
			
	}

}
