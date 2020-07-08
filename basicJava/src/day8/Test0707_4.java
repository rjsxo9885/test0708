package day8;

import java.util.Scanner;

public class Test0707_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int sum = 0;	// 합계

				int max = 0;	// 최대값

				int min = 0;    	// 최소값
				
			

				for( int i = 0 ; i < 5 ; i++ ) {

					System.out.printf("%d 번째 정수를 입력하세요 : ", i+1);

					

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

				

			

				System.out.printf("최대값 : %d, 최소값 : %d 입니다.\n", 

						max, min);

			}



		}



