package timeattack;

import java.util.Random;
import java.util.Scanner;

public class rewind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd=  new Random();
		
		//15
		int n = sc.nextInt();
		
		int result = 1;
		for(int i=0; i<n; i++) {
			result += i;
			System.out.print(result + " ");
		}

		
		//보너스4(18다음)
		int[] arr= new int[6];
		
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
		//20
		//보너스5(22다음)
		//23
	}
	public static boolean isDuplicate(int n, int[] arr) {
		for(int item : arr) {
			if(item == n) {
				return true;
			}
		}
		return false;
		
	}

}
