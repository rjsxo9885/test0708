package day11;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int kor =10;
		int eng =40;
		int math = 50;
		int total =kor +eng + math;
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(math);
		// 				3�� ����� ���� , �迭�� ũ�� ,����
		//int kimScore[] = {10,40,50} ; 
		int [] kimScore = new int[4];
		total = kimScore[0]+kimScore[1]+kimScore[2];
		kimScore[0] = 10;
		kimScore[1] = 40;
		kimScore[2] = 50;
		kimScore[3] = 100;
		
		System.out.println(kimScore[0]);
		System.out.println(kimScore[1]);
		System.out.println(kimScore[2]);
		
		for(int i =0; i<kimScore.length; i++) {
			System.out.println(kimScore[i]);
		}
		double[]dArr = {1.1,2.2,3.3};
		
		int size =dArr.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(dArr[idx]);
		}
		
		char[]chArr = {'H','a','p','p','y'}; //2byte*5->10byte
		size = chArr.length;
		
		String[]season = {"��","����","����","�ܿ�"};
		
		size =  season.length;
		
		for(int i=0; i<size; i++) {
			System.out.println(season[i]);
		}
		
		//����1 ) ��  ���ܾ� ���� ������ ���� AEIOU ,aeiou
		char[]word = {'H','a','p','p','y'}; //2byte*5->10byte
		int mo = 0;
		
		for(int idx=0; idx<word.length; idx++) {
			char c = word[idx];
			if(c>='A'&&c<'Z') {
				c=(char)(c+32);
			}
			switch(c) {
			case'a':mo++;
			case'e':mo++;
			case'i':mo++;
			case'o':mo++;
			case'u':mo++;
				
			}
		}
		System.out.println("�ܾ�� ������ ���� :"+mo);
		//���� 2)��ҹ��ڸ� ���� ��ȯ�Ͽ� ����ϱ�
		char[]wd = {'H','a','p','p','y'};
		
		for(int idx=0; idx<word.length; idx++) {
			char ch = wd[idx];
			if(ch>='A'&&ch<='Z') {
				System.out.println((char)(ch+32));
			}else if(ch>='a'&&ch<='z') {
				System.out.println((char)(ch-32));
			}
		
		
		
		
	}
		System.out.println("Happy".toUpperCase());
		System.out.println("Happy".toLowerCase());
	}
}


