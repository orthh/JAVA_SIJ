package timeattack;

import java.util.Arrays;
import java.util.Scanner;

public class Q30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 >> ");
		String[] input = sc.nextLine().replace(" ","").split("");
		
		char s = 'a';
		char e = 'z';
		
		int[] arr = new int[e-s + 1];
		
		for(String item : input) {
			arr[item.charAt(0) - s]++;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(s++ + " : " + arr[i]);
		}
		

	}

}
