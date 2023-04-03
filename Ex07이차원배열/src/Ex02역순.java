
public class Ex02역순 {

	public static void main(String[] args) {
		
		int num = 1;
		int[][] arr = new int[5][5];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i==0 || i%2 ==0) {
					//짝수행(idx 0,2,..)
					arr[i][j] = num++;
				}else {
					//홀수행(idx 1,3,5)
					arr[i][4-j] = num ++;
				}
			}
 		}
		
		
		//출력
		for(int i = 0 ; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}
		
		int[][] seat = new int[3][];
	}

}
