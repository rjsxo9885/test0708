package day12;

public class ArrayTest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1���� �迭:��
		//int[]arr = new int[6];
		//              0 1 2 3 4 5 6
		
		int [] arr1 = {11,22,33,44,55,66};
		
		for(int  i=0;i<arr1.length; i++) {//1�����迭�� "��ü���"����ϱ�
			System.out.println(arr1[i]); //1)�ݺ�Ƚ�� 2)�ݺ�÷��
		}
		//���� for(each-for):�迭 ��ü����� ��ȸ
		for(int element:arr1) {//element = arr1[0]------element =arr1[5];
			System.out.println(element);
		}
		char[] ch = {'A','B','C'};
		for(char i:ch) {
			System.out.println(i);
			
		}
		
		
		int[][]arr2 = {{11,22,33},{44,55,66,}};
		
		arr2[0][0]=11;
		arr2[0][1]=22;
		arr2[0][2]=33;
		arr2[1][0]=44;
		arr2[1][1]=55;
		arr2[1][2]=66;
		
		for(int row=0; row<2; row++) {
			for(int col=0; col<3; col++) {
				System.out.print(arr2[row][col]+"");
				
			}
			System.out.println();
		}
		
		
	
		
	}

}
