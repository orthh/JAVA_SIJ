package last;

import java.util.Arrays;
import java.util.Scanner;

public class Bonus05Rewind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print(i+1 + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("정렬 후");
		
		//버블 정렬
		int temp;
		boolean isEnd;
		for(int i=0; i<arr.length-1; i++) {
			isEnd  = true;
			for(int j=0; j<arr.length - (1 + i); j++) {
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
		
		System.out.println(Arrays.toString(arr));

	}

}
