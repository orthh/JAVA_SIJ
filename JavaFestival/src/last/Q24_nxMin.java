package last;

import java.util.Scanner;

public class Q24_nxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N입력 >> ");
		int n = sc.nextInt();
		
		System.out.print("X입력 >> ");
		int x = sc.nextInt();
		
		int[] arr = new int[n];
		
		int cnt = 0;
		while(true) {
			System.out.print(cnt + 1 + "번째 정수 입력 >> ");
			arr[cnt] = sc.nextInt();
			cnt++;
			if(cnt >= n) {
				break;
			}
		}
		
		System.out.print("결과 >> ");
		for(int item : arr) {
			if(item < x) {
				System.out.print(item + " ");
			}
		}
		
	}

}
