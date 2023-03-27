import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		int result = 1;
		for(int i = 1; i <= num; i++) {
			System.out.println(result);
			result += i;
		}

	}

}
