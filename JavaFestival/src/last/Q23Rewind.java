package last;

public class Q23Rewind {

	public static void main(String[] args) {
		

		
		int n = 5;
		int[][] arr = new int[n][n];
		
		int num = 1;
		System.out.println("원본");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = num++;
			}
		}
		
		//원본 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		//회전
		System.out.println("90도 회전");
		int[][] newArr = new int[n][n];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				newArr[4-j][i] = arr[i][j];
			}
		}
		//회전출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",newArr[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
