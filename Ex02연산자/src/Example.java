import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int inputSeconds = sc.nextInt();
		
		int hours = inputSeconds /60 / 60;
		
		int minutes = inputSeconds / 60 % 60;
		
		int seconds = inputSeconds % 60;

		
		System.out.printf("%d시 %d분 %d초", hours, minutes, seconds);
	}

}
