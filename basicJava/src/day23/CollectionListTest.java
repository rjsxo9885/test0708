package day23;


import java.util.*;

public class CollectionListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List<Integer> list = new ArrayList<Integer>();
	   //데이터 추가
	   
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.add(50);
	   list.add(60);
	   list.add(10);
	   
	   System.out.println("데이터 갯수"+list.size());
	   //5번째 값 얻기
	   
	   System.out.println("5번 째 값 : "+list.get(4));
	   //5번째 값 삭제
	   
	   list.remove(4);
	   System.out.println("5번째 값"+list.get(4));
	   list.add(2, 123);
		
	   System.out.println("5번째 값"+list.get(4));
		
	   for(int i=0; i<list.size(); i++) {
		  System.out.println( (i+1)+"번째의 값은 :"+list.get(i));
	   }
	   System.out.println("=====================================");
	   
	   list.set(3, 1234);
	   
	   for(int i=0; i<list.size(); i++) {
			  System.out.println( (i+1)+"번째의 값은 :"+list.get(i));
		   }
	   list.add(3, 12345);
	   System.out.println("=========================================");
	   
	   for(int i=0; i<list.size(); i++) {
			  System.out.println( (i+1)+"번째의 값은 :"+list.get(i));
		   }
	   
	   
	   
	   
	   //1. 전체 데이터 확인 
	   
	   System.out.println("1. 전체  데이터의 확인===");
	   
	   	for(int x =0; x<list.size(); x++) {
	   		System.out.println(list.get(x)+" ");
	   	}
	   	
	   	//2.전체 데이터의  확인
	   	//collection 클래스만 사용가능
	   	
	   	System.out.println("2. 전체 데이터의  확인 ==");
	   	java.util.Iterator<Integer> it = list.iterator();
	   	
	   	while(it.hasNext()) {
	   		
	   		System.out.println(it.next()+" ");
	   		
	   	}
	   	
	   	//3.전체 데이터의  확인
	   	for(Integer i :list) {
	   		System.out.println(i+"");
	   	}
	   	System.out.println();
	   	
	   	
	   	
	   	list.clear();
	   	System.out.println("데이터 갯수 :"+list.size());
	   	System.out.println("5번째 값 :"+list.get(4));
	}

}
