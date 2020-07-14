package day12;

public class ArrayTest8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//220page:이차원 배열의행길이와 열길이
			//참조형 변수 배열객체
		
		int[][]arr = new int [][] {{1,2,3},{4,5,6},{7,8}};
		//int [][]arr = {{1,2,3},{4,5,6}};
		
		
		
		System.out.println("2차원 배열의 행크기 :"+arr.length);
		System.out.println("2차원 0행 배열의 열크기:"+arr[0].length);
		System.out.println("2차원 1행 배열의 열크기:"+arr[1].length);
		System.out.println("2차원 2행 배열의 열크기:"+arr[2].length);
		
		for(int i =0;i<arr.length; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
	}

}
