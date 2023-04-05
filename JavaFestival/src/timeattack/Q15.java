package timeattack;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		int n = sc.nextInt();
		
		int cnt= 0;
		int result = 1;
		while(true) {
			result += cnt;
			System.out.print(result + " ");
			cnt++;
			if(cnt >= n) {
				break;
			}
		}
		
		int result2 = 1;
		for(int i= 0 ;i<n; i++) {
			result2 += i;
			System.out.println(result2);
		}

	}

}
