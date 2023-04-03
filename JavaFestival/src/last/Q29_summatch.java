package last;

import java.util.Random;
import java.util.Scanner;

public class Q29_summatch {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int life = 5;
		while(true) {
			if(life <=0) {
				System.out.println("GAME OVER!!");
				break;
			}
			
			int num1 = rd.nextInt(10) + 1 ;
			int num2 = rd.nextInt(10) + 1;
			System.out.printf("%d + %d = ", num1,num2);
			int uAnswer = sc.nextInt();
			
			if(num1 + num2 == uAnswer) {
				System.out.println("Success!");
			}else {
				System.out.println("Fail...");
				life--;
			}
			
		}

	}

}
