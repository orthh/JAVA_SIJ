package timeattack;

import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(60) + 1;
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int item : arr) {
			if(item > max) {
				max = item;
			}
			if(item < min) {
				min = item;
			}
		}
		System.out.print("배열에 있는 모든 값 : ");
		for(int item : arr) {
			System.out.printf("%3d",item);
		}
		System.out.println("\n가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		

	}

}
