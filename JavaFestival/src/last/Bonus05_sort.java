package last;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus05_sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int idx = 0;
		do {
			System.out.printf("%d번째 수 입력 : ", idx+1);
			arr[idx++] = sc.nextInt();
		} while (idx < arr.length);

		//test
		System.out.println(Arrays.toString(arr));
		
		//버블정렬
		int temp;
		boolean isEnd;
		for(int i=0; i<arr.length - 1; i++) {
			isEnd = true;
			for(int j= 0; j<arr.length - (1 + i); j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					isEnd = false;
				}
			}
			if(isEnd) {
				break;
			}
		}
		
		//선택정렬
		
		
		//정렬후
		System.out.println(Arrays.toString(arr));
	}

}
