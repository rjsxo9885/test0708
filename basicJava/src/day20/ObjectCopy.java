package day20;

import day21.Book;

public class ObjectCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Book[] bookarray1 = new Book[3];
			Book[] bookarray2 = new Book[3];
			
			bookarray1[0] = new Book("�¹���","������");
			bookarray1[1] = new Book("���̾�","�츣�� �켼");
			bookarray1[2] = new Book("��� ����ΰ�","���ù�");
			System.arraycopy(bookarray1, 0, bookarray2, 0, 3);
			
			for(int i=0; i<bookarray2.length; i++) {
				bookarray2[i].showBookInfo();
			}
			
			
	}

}
