package timeattack;

import java.util.Scanner;

public class Q31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int input = sc.nextInt();
		
		int result = 1;
		for(int i= input; i>=1; i--){
			result *= i;
		}
		System.out.println(result);

	}

}
