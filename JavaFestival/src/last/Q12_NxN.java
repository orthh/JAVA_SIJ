package last;

import java.util.Scanner;

public class Q12_NxN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 N 입력 >> ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		
		int num = 1;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				arr[j][i] = num++;
			}
		}
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}
		
		
	}
	


}
