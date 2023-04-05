package timeattack;

import java.util.Scanner;

public class Q24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N입력 >> ");
		int n = sc.nextInt();
		
		System.out.print("X입력 >> ");
		int x = sc.nextInt();
		
		String result = "";
		
		for(int i=0; i<n; i++) {
			System.out.print(i+1 + "번째 정수 입력 >> ");
			int num = sc.nextInt();
			if( num < x) {
				result += (num + " ");
			}
		}
		System.out.println("결과 >> " + result);

	}

}
