package 탐색;

import java.util.Arrays;

public class Ex03이진탐색 {

	public static void main(String[] args) {
		
		int[] arr = {10,24,7,68,42,82,3,43,22,74};
		

		
		//버블정렬
		int temp;
		boolean isEnd;
		for(int i=0; i<arr.length - 1; i++) {
			isEnd = true;
			for(int j=0; j<arr.length - (i + 1); j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					isEnd =false;
				}
			}
			if(isEnd) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		//이진검색
		int target = 68;
		
		int s = 0;
		int e = arr.length - 1; //9
		
		while(true) {
			int m = (s+e) / 2; //4
			if(arr[m] == target) {
				System.out.println(m+ "번 인덱스");
				break;
			}else {
				if(arr[m] > target) {
					e = m - 1;
				}else {
					s = m + 1;
				}
			}
		}
		
		
		
		
		
		
		
		
	}

}
