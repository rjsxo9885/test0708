package day12;

public class ArrayTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//220page:������ �迭������̿� ������
			//������ ���� �迭��ü
		
		int[][]arr = new int [][] {{1,2,3},{4,5,6},{7,8}};
		//int [][]arr = {{1,2,3},{4,5,6}};
		
		
		
		System.out.println("2���� �迭�� ��ũ�� :"+arr.length);
		System.out.println("2���� 0�� �迭�� ��ũ��:"+arr[0].length);
		System.out.println("2���� 1�� �迭�� ��ũ��:"+arr[1].length);
		System.out.println("2���� 2�� �迭�� ��ũ��:"+arr[2].length);
		
		for(int i =0;i<arr.length; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
