package day23;
//교재 :388page

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
		
		Mountain one  = new Mountain("한라산",1950);
		Mountain two = new Mountain("설악산",1230);
		Mountain three = new Mountain("지리산",1900);
		Mountain four = new Mountain("북한산",1000);
		
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
	 * ===========제네릭(스)generics======
	 * 자료형 (data type)
	 * 객체를 저장하는 기술 컬렉션 프레임 워크를 개선한 기능 
	 */
	
}
