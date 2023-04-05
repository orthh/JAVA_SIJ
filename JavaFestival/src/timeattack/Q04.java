package timeattack;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int balance = sc.nextInt();
		System.out.println("잔돈 : " + balance);
		System.out.println("10000원 : " + balance / 10000);
		balance %= 10000;
		System.out.println("5000원 : " + balance / 5000);
		balance %= 5000;
		System.out.println("1000원 : " + balance / 1000);
		balance %= 1000;
		System.out.println("500원 : " + balance / 500);
		balance %= 500;
		System.out.println("100원 : " + balance / 100);
		balance %= 100;

	}

}
