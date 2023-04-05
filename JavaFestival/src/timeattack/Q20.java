package timeattack;

import java.util.Arrays;
import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		int[] arr = new int[30];
		
		int idx = 0;
		while(num !=0) {
			arr[idx] = num %2;
			num /= 2;
			idx++;
		}
		for(int i=idx - 1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		

	}

}
