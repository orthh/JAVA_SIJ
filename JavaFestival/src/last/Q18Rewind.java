package last;

import java.util.Arrays;
import java.util.Random;

public class Q18Rewind {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = new int[6];
		
		int num;
		for(int i=0; i<arr.length; i++) {

			while(true) {
				num = rd.nextInt(50) + 1;
				if(!isDuplicate(arr,num)) {
					arr[i] = num;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
	
	public static boolean isDuplicate(int[] arr,int num) {
		for(int item : arr) {
			if(item == num) {
				return true;
			}
		}
		return false;
	}

}
