package timeattack;

import java.util.Random;
import java.util.Scanner;

public class Q29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int life = 5;
		
		while(life>0) {
			int num1 = rd.nextInt(10) + 1;
			int num2 = rd.nextInt(10) + 1;
			System.out.println(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();
			if(num1 + num2 == input) {
				System.out.println("SUCCESS!");
			}else {
				System.out.println("Fail...");
				life--;
			}
			
		}
		System.out.println("GAME OVER!!");

	}

}
