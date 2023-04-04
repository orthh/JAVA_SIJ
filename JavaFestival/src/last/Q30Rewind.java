package last;

import java.util.Arrays;
import java.util.Scanner;

public class Q30Rewind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 알파벳 빈도수 구하기 ====");
		
		System.out.print("입력 >> ");
		String[] input = sc.nextLine().replace(" ", "").toLowerCase().split("");

		char s = 'a';
		char e = 'z';
		
		int[] arr = new int[e-s + 1];
		
		for(String item: input) {
			arr[item.charAt(0) - s]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(s++ + ": " + arr[i]);
		}
		
		
	}

}
