package last;

import java.util.Scanner;

public class Q31_factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num =sc.nextInt();
		
		int result = 1;
		for(int i = num; i>1; i--) {
			result *= i;
		}

		System.out.println(result);
	}

}
