package day23;

import java.util.*;
public class CollectionMap {

	public static void main(String[] args) {
		// Map : ������ ���� ,�̸�(key) �ߺ� ������
			//Map : ������ ����, �̸�(key) �ߺ� ������.
		//������ �߰��� put �޼ҵ� ���
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 444);
		map.put("ddd", 555);
		map.put("eee", 666);
		
		System.out.println("Map size :"+map.size());
		//������ ������
		System.out.println(map.get("aaa"));
		
		
		//������ ����
		map.remove("aaa");
		
		map.clear();
		
	}

}
