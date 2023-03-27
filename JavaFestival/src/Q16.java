import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		//팩토리얼 로직
		int result = 1;
		for(int i = num; i>=1; i--) {
			result *= i;
		}
		System.out.println("출력 : " + result);
		
	}

}
