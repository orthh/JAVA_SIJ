package last;

import java.util.Random;

public class Q10Rewind {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = new int[8];
		

		//할당
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(70) + 1	;
		}
		
		//max,min구하기
		int max = arr[0];
		int min = arr[0];
		for(int item : arr) {
			if(item > max) {
				max = item;
			}
			if(item < min) {
				min = item;
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
