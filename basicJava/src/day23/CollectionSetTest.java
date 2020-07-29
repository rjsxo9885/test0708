package day23;

import java.util.HashSet;
import java.util.*;

public class CollectionSetTest {

	public static void main(String[] args) {
		// Set : 순서가 없고 , 데이터 중복 허용 안함

		Set<String>set = new HashSet<String>();
		set.add("호랑이");
		set.add("사자");
		set.add("사슴");		//중복허용 X
		set.add("코끼리");
		set.add("돌고래");
		System.out.println("데이터의 갯수 :"+set.size());
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals("사슴")) {
				i.remove();
			}
		}
		System.out.println("데이터의 갯수 :"+set.size());
		
		it =set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

}
	
}
