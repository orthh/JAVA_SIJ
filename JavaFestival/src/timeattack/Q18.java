package timeattack;

import java.util.Random;
import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int[] arr = new int[6];
		
		int num;
		for(int i=0; i<arr.length; i++) {
			do {
				num = rd.nextInt(46) + 1;
			} while (isDuplicate(num, arr));
			arr[i] = num;
		}
		
		for(int item : arr) {
			System.out.println("행운의 숫자 : " + item);
		}

	}
	
	public static boolean isDuplicate(int num, int[] arr) {
		for(int item : arr) {
			if(item == num) {
				return true;
			}
		}
		return false;
	}

}
