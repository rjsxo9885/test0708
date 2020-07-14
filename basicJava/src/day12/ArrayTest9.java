package day12;

public class ArrayTest9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][]twoD = new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		int k =0;
		
		/*
		for(int i=0; i<4 ; i++) {
			for(int j=0; j<i; j++) {
				twoD[i][j] =++k;
				System.out.printf("%3d",twoD[i][j]);
			}
			System.out.println();
		}
		for(int i=0; i<twoD[i].length; i++) { //twoD.length :4
			for(int j=0; j<twoD[i].length;j++) {//twoD[j].length :1,2,3,4
			System.out.printf("%3d",twoD[i][j]);
		}
			System.out.println();
		}
		*/
		
		System.out.println(twoD[2]);
		
	}

}
