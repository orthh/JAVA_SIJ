package last;

public class Q21Rewind {

	public static void main(String[] args) {
		
		int[] point = {92,32,52,9,81,2,68};
		
		int min = Math.abs(point[1] - point[0]);
		int idx1 = 0;
		int idx2 = 0;
		for(int i=0; i<point.length; i++) {
			for(int j=i+1; j<point.length; j++) {
				if(Math.abs(point[i] - point[j]) < min) {
					min = Math.abs(point[i] - point[j]);
					idx1 = i;
					idx2 = j;
					
				}
			}
		}
		
		System.out.printf("result = [%d, %d]",idx1,idx2);

	}

}
