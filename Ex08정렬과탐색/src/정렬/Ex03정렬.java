package 정렬;

import java.util.Arrays;

public class Ex03정렬 {

	public static void main(String[] args) {
		
		int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };
		
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		//Arrays -> 클래스 -> 객체
		Arrays.sort(arr);
	
		System.out.println("정렬 후 : " + Arrays.toString(arr));

	}

}
