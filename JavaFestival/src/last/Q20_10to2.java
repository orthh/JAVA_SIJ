package last;

import java.util.Scanner;

public class Q20_10to2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("숫자입력 >> ");
		int num = sc.nextInt();
		
		int[] arr = new int[30];
		
		int cnt =  0;
		while(num != 0) {
			arr[cnt] = num%2;
			num /= 2;
			cnt++;
		}
		for(int i=cnt - 1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
