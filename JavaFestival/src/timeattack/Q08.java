package timeattack;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("숫자 입력 : ");
		int result = sc.nextInt();
		
		if(result % 10 >= 5) {
			result = result /10 * 10 + 10;
		}else {
			result = result /10 * 10;
		}
		
		System.out.println("반올림 수 :" + result);

	}

}
