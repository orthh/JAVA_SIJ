package timeattack;

public class Q21 {

	public static void main(String[] args) {
		int[] point = {92,32,52,9,81,2,68} ;
		
		int idx1 = 0;
		int idx2 = 0;
		
		int min = Math.abs(point[0] - point[1]);
		for(int i = 0; i<point.length ; i++) {
			for(int j= i+1; j<point.length; j++) {
				if(min > Math.abs(point[i] - point[j])) {
					min = Math.abs(point[i] - point[j]);
					idx1 = i;
					idx2 = j;
				}
			}
		}
		
		System.out.printf("result = [%d, %d]", idx1,idx2);

	}

}
