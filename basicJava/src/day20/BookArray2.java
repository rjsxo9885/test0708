package day20;

import day21.Book;

public class BookArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book[] libray = new Book[5];
		libray[0] = new Book("�¹���","������");
		libray[1] = new Book("���̾�","�츣�� �켼");
		libray[2] = new Book("��� �� ���ΰ�", "���ù�");
		libray[3]  = new Book("����","�ڰ渮");
		libray[4] = new Book("�����","�������丮");
		
		for(int i=0; i<libray.length; i++) {
			libray[i].showBookInfo();
		}
		for(int i=0; i<libray.length; i++) {
			System.out.println(libray[i]);
		}
		
	}

}
