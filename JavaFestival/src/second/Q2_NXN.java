package second;

import java.util.Arrays;
import java.util.Scanner;

public class Q2_NXN {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 N을 입력받아 N * N 배열에
		//다음과 같이 숫자를 저장하고 출력하시오.
		System.out.print("숫자 입력 >> ");
		int num = sc.nextInt();
		
		int[][] numArr = new int[num][num];
		
//		//배열 값할당(행)
//		for(int i = 0; i<num ; i++) {
//			
//			for(int j=0; j<num; j++) {
//				numArr[i][j] = i + num * j + 1;
//			}
//		}
//			
		
		//배열 값할당(열)
//		for(int i = 0; i<num ; i++) {
//			
//			for(int j=0; j<num; j++) {
//				numArr[j][i] = j + num * i + 1;
//			}
//		}
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				numArr[j][i] = j + 1 + num * i;
			}
		}
		
		//배열출력
		for(int[] item : numArr) {
			for(int elem : item ) {
				System.out.printf("%3d", elem);
			}
			System.out.println();
		}
		
	
		
		
		
		//빌드업해서 다시 배열값 할당
		//열
//		for(int j=0; j<=5; j++) {
//			numArr[j][0] = j;
//		}
//		for(int j=0; j<=5; j++) {
//			numArr[j][1] = j + 5;
//		}
//		for(int j=0; j<=5; j++) {
//			numArr[j][2] = j + 10;
//		}
//		for(int j=0; j<=5; j++) {
//			numArr[j][3] = j + 15;
//		}
//		for(int j=0; j<=5; j++) {
//			numArr[j][4] = j + 20;
//		}
//		
//		for(int i=0; i<num; i++) {
//			for(int j=1; j<num; j++) {
//				numArr[j][i] = j + num * i;
//			}
//		}
		
	}

}
