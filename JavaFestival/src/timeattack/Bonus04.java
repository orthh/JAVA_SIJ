package timeattack;

import java.util.Scanner;

public class Bonus04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0; i<5; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int item : arr) {
			System.out.print(item + " : " );
			for(int i=0; i<item; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
