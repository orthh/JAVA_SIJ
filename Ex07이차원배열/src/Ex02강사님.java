
public class Ex02강사님 {

	public static void main(String[] args) {
		
		int[][]arr = new int[5][5];
		
		int num = 1;
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][4-j] = num++;
			}
		}
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		int[][]arr2 = new int[5][5];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = (arr2.length * (i + 1)) -j;
			}
		}
		
		for(int i = 0 ; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.printf("%3d",arr2[i][j]);
			}
			System.out.println();
		}

	}

}
