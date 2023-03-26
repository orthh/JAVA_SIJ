import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("총금액 입력 : ");
		int balance = sc.nextInt();

		System.out.print("\\n");
		System.out.println("잔돈 : " + balance + "원");
		System.out.println("10000원 : " +  balance / 10000 + "개");
		balance %= 10000;
		System.out.println("5000원 : " +  balance / 5000 + "개");
		balance %= 5000;
		System.out.println("1000원 : " +  balance / 10000 + "개");
		balance %= 1000;
		System.out.println("500원 : " +  balance / 500 + "개");
		balance %= 500;
		System.out.println("100원 : " +  balance / 100 + "개");
		balance %= 100;

	}

}
