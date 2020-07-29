package day23;

import java.util.HashSet;
import java.util.*;

public class CollectionSetTest {

	public static void main(String[] args) {
		// Set : ������ ���� , ������ �ߺ� ��� ����

		Set<String>set = new HashSet<String>();
		set.add("ȣ����");
		set.add("����");
		set.add("�罿");		//�ߺ���� X
		set.add("�ڳ���");
		set.add("����");
		System.out.println("�������� ���� :"+set.size());
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Iterator<String> i = set.iterator();
		
		while(i.hasNext()) {
			if(i.next().equals("�罿")) {
				i.remove();
			}
		}
		System.out.println("�������� ���� :"+set.size());
		
		it =set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

}
	
}
