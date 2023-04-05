package timeattack;

import java.util.Scanner;

public class Bonus01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("A 입력 >> ");
			int num1 = sc.nextInt();
					System.out.print("A 입력 >> ");
			int num2 = sc.nextInt();
			
			if(num1 ==0 && num2==0) {
				break;
			}
			System.out.println("결과 >> " + (num1- num2));
		}

	}

}
