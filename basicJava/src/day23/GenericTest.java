package day23;
//���� :388page

import java.util.ArrayList;
import java.util.List;


class Mountain{
	String name;
	int height;
	public Mountain() {}
	public Mountain(String name,int height) {
		this.name = name;
		this.height = height;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>list=new ArrayList<>();
		list.add("seoul");
		list.add("busan");
//		list.add(3);
//		list.add(3.14);
//		list.add(new Integer(5));
		
		Mountain one  = new Mountain("�Ѷ��",1950);
		Mountain two = new Mountain("���ǻ�",1230);
		Mountain three = new Mountain("������",1900);
		Mountain four = new Mountain("���ѻ�",1000);
		
		int [] A = new int[10];
		ArrayList<Mountain>moun = new ArrayList<>();
		moun.add(one);
		moun.add(two);
		moun.add(three);
		moun.add(four);
		//<1>
		for(int i=0; i<moun.size(); i++) {
			//System.out.println(moun.get(i));
			Object obj = moun.get(i);
			Mountain dto = (Mountain)obj;
			System.out.println(dto.name+":"+dto.height);
		}
		
		//2>
		java.util.Iterator<Mountain>iter = moun.iterator();
		while(iter.hasNext()) {
			Mountain dto = iter.next();
			System.out.println(dto.name+":"+dto.height);
		}
		
	}
	/*
	 * ===========���׸�(��)generics======
	 * �ڷ��� (data type)
	 * ��ü�� �����ϴ� ��� �÷��� ������ ��ũ�� ������ ��� 
	 */
	
}
