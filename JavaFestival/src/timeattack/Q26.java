package timeattack;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 >> ");
		String num2 = sc.next();
		String[] num2toArr = num2.split("");
		
		for(int i=num2toArr.length - 1; i>=0; i--) {
			System.out.println(num1 * Integer.parseInt(num2toArr[i]));
		}
		
		System.out.println(num1 * Integer.parseInt(num2));
		
	}

}
