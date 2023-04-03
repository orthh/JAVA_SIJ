package last;

import java.util.Scanner;

public class Bonus01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int  num1,num2;
		while(true) {
			System.out.print("A입력 >> ");
			num1 = sc.nextInt();
			System.out.print("B입력 >> ");
			num2 = sc.nextInt();
			if(num1 ==0 && num2 ==0) {
				break;
			}
			System.out.println("결과 >> " + (num1 - num2));
			
		}

	}

}
