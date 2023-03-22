import java.util.Scanner;

public class ExampleTeacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int hour = input / 3600 ;
		int min = input % 3600 / 60;
		int seconds = input % 60;
		
		System.out.printf("%d시 %d분 %d초", hour,min,seconds);
	}

}
