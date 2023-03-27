import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		//정수를 입력받아
		//1의 자리에서 반올림 한 결과를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		int result = num % 10 >= 5 
				? num /10 * 10 + 10
				: num / 10 * 10;
		
		
		System.out.println("반올림 수 : " + result);
	}

}
