package day8;

import java.util.Scanner;

public class Test0707_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int sum = 0;	// �հ�

				int max = 0;	// �ִ밪

				int min = 0;    	// �ּҰ�
				
			

				for( int i = 0 ; i < 5 ; i++ ) {

					System.out.printf("%d ��° ������ �Է��ϼ��� : ", i+1);

					

				int	temp = sc.nextInt();

					

			

					if( i == 0 )

						max = min = temp;

					
					else {

						if( temp > max )

							max = temp;

						if( min > temp )

							min = temp;

					}

				}

				

			

				System.out.printf("�ִ밪 : %d, �ּҰ� : %d �Դϴ�.\n", 

						max, min);

			}



		}



