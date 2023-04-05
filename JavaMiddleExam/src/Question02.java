import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자입력 >> ");
		int num = sc.nextInt();
		
		System.out.println("10으로 나눈 몫 : " + num / 10);
		System.out.println("10으로 나눈 나머지 : " + num % 10);

	}

}
