package last;

import java.util.Scanner;

public class Q4_balance {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		
		System.out.println("잔돈 : " + total);
		
		System.out.println("10000원 : " + total/10000 + "개");
		total %= 10000;
		System.out.println("5000원 : " + total/5000 + "개");
		total %= 5000;
		System.out.println("10000원 : " + total/1000 + "개");
		total %= 1000;
		System.out.println("10000원 : " + total/500 + "개");
		total %= 500;
		System.out.println("10000원 : " + total/100 + "개");
		total %= 100;
	}
}
