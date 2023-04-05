package timeattack;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		String[] arr = sc.nextLine().split("");
		
		int sum = 0;
		
		for(String item : arr) {
			sum += Integer.parseInt(item);
		}
		System.out.println("합은 " + sum +  "입니다.");
		
		//2. 알고리즘
		System.out.print("정수 입력 : ");
		String str = sc.nextLine();
		
		int num = Integer.parseInt(str);
		
		int sum2 = 0;
		for(int i=0; i<str.length(); i++) {
			sum2 += num % 10;
			num /= 10;
		}
		System.out.println(sum2);
		

	}

}
