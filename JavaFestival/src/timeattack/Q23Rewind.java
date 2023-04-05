package timeattack;

public class Q23Rewind {

	public static void main(String[] args) {
		
		System.out.println("원본");
		int n = 10;
		int[][] arr= new int[n][n];
		int num = 1;
		for(int i = 0; i< arr.length ; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = num++;
			}
		}
		
		for(int i = 0; i< arr.length ; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n90도 회전");
		//90도 회전
		int[][] newArr = new int[arr.length][arr.length];
		for(int i = 0; i< arr.length ; i++) {
			for(int j=0; j<arr.length; j++) {
				newArr[arr.length - 1 - j][i] = arr[i][j];
			}
		}
		
		for(int i = 0; i< arr.length ; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.printf("%3d",newArr[i][j]);
			}
			System.out.println();
		}

	}

}
