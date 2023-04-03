package last;

public class Q23_rotate90 {

	public static void main(String[] args) {
		int[][] oriArr = new int[5][5];

		int num = 1;
		for (int i = 0; i < oriArr.length; i++) { // 반복
			for (int j = 0; j < oriArr[i].length; j++) { // 1차원 배열 하나 만듬
				oriArr[i][j] = num++;
			}
		}
		// 원본출력
		System.out.println("원본");
		for (int i = 0; i < oriArr.length; i++) {
			for (int j = 0; j < oriArr[i].length; j++) {
				System.out.printf("%3d", oriArr[i][j]);
			}
			System.out.println();
		}

		System.out.println("");
		System.out.println("90도 회전");
		// 로테이트출력
		int[][] rotate90Arr = leftRotate90(oriArr);
		for (int i = 0; i < rotate90Arr.length; i++) {
			for (int j = 0; j < rotate90Arr[i].length; j++) {
				System.out.printf("%3d", rotate90Arr[i][j]);
			}
			System.out.println();
		}

	}

	public static int[][] leftRotate90(int[][] n) {
		int[][] newArr = new int[n.length][n.length];
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				swap(n,newArr, i, j, n[i].length - 1 - j, i);
			}
		}
		return newArr;
	}

	public static void swap(int[][] a, int[][] b, int idx1, int idx2, int idx3, int idx4) {
		int temp = 0;
		//바꾸는게 아니라 할당.
		//a[idx1][idx2] 를 b[idx3,idx4]에 할당.
		b[idx3][idx4] = a[idx1][idx2];
		
	}

}
