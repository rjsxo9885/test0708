package day23;


import java.util.*;

public class CollectionListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   List<Integer> list = new ArrayList<Integer>();
	   //������ �߰�
	   
	   list.add(10);
	   list.add(20);
	   list.add(30);
	   list.add(40);
	   list.add(50);
	   list.add(60);
	   list.add(10);
	   
	   System.out.println("������ ����"+list.size());
	   //5��° �� ���
	   
	   System.out.println("5�� ° �� : "+list.get(4));
	   //5��° �� ����
	   
	   list.remove(4);
	   System.out.println("5��° ��"+list.get(4));
	   list.add(2, 123);
		
	   System.out.println("5��° ��"+list.get(4));
		
	   for(int i=0; i<list.size(); i++) {
		  System.out.println( (i+1)+"��°�� ���� :"+list.get(i));
	   }
	   System.out.println("=====================================");
	   
	   list.set(3, 1234);
	   
	   for(int i=0; i<list.size(); i++) {
			  System.out.println( (i+1)+"��°�� ���� :"+list.get(i));
		   }
	   list.add(3, 12345);
	   System.out.println("=========================================");
	   
	   for(int i=0; i<list.size(); i++) {
			  System.out.println( (i+1)+"��°�� ���� :"+list.get(i));
		   }
	   
	   
	   
	   
	   //1. ��ü ������ Ȯ�� 
	   
	   System.out.println("1. ��ü  �������� Ȯ��===");
	   
	   	for(int x =0; x<list.size(); x++) {
	   		System.out.println(list.get(x)+" ");
	   	}
	   	
	   	//2.��ü ��������  Ȯ��
	   	//collection Ŭ������ ��밡��
	   	
	   	System.out.println("2. ��ü ��������  Ȯ�� ==");
	   	java.util.Iterator<Integer> it = list.iterator();
	   	
	   	while(it.hasNext()) {
	   		
	   		System.out.println(it.next()+" ");
	   		
	   	}
	   	
	   	//3.��ü ��������  Ȯ��
	   	for(Integer i :list) {
	   		System.out.println(i+"");
	   	}
	   	System.out.println();
	   	
	   	
	   	
	   	list.clear();
	   	System.out.println("������ ���� :"+list.size());
	   	System.out.println("5��° �� :"+list.get(4));
	}

}
