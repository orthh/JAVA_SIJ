package last;

import java.util.Random;

public class Q10_arrMaxMin {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int num = 8;
		
		int[] rdArr = new int[num];
		System.out.print("배열에 있는 모든 값 : ");
		for(int i = 0; i<rdArr.length; i++) {
			rdArr[i] = rd.nextInt(60) + 1;
			System.out.print(rdArr[i] + " ");
		}
		System.out.println();


		
		System.out.println("가장 큰 값 : "  + max(rdArr));
		System.out.println("가장 작은 값 : "  + min(rdArr));
		
		


	}
	public static int max(int[] arr) {
		int result = arr[0];
		for(int item: arr) {
			if(result < item) {
				result = item;
			}
		}
		return result;
	}
	
	public static int min(int[] arr) {
		int result = arr[0];
		for(int item: arr) {
			if(result > item) {
				result = item;
			}
		}
		return result;
	}

}
