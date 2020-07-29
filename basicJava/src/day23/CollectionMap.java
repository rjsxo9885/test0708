package day23;

import java.util.*;
public class CollectionMap {

	public static void main(String[] args) {
		// Map : 순서가 없고 ,이름(key) 중복 허용안함
			//Map : 순서가 없고, 이름(key) 중복 허용안함.
		//데이터 추가는 put 메소드 사용
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 444);
		map.put("ddd", 555);
		map.put("eee", 666);
		
		System.out.println("Map size :"+map.size());
		//데이터 꺼내기
		System.out.println(map.get("aaa"));
		
		
		//데이터 삭제
		map.remove("aaa");
		
		map.clear();
		
	}

}
