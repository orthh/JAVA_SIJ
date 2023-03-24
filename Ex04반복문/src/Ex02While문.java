import java.util.Scanner;

public class Ex02While문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int num = 0;
//		while(num <= 10) {
//			System.out.print("값 : ");
//			num = sc.nextInt();
//		}
//		System.out.println("while문 탈출!");
//		
//		while(true) {
//			System.out.print("값 : ");
//			int input = sc.nextInt();
//			if(input > 10) break;
//		}
//		System.out.println("whileTrue Break!");
//		
//		int input1;
//		do {
//			System.out.print("값 : ");
//			input1 = sc.nextInt();
//		} while (input1 <= 10);
//		System.out.println("do~while문 탈출!");
		
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		while(true) {
			System.out.print("숫자입력 : ");
			int input = sc.nextInt();
			if(input == -1) {
				System.out.println("누적결과 : " + sum);
				System.out.println("짝수 : " + even);
				System.out.println("홀수 : " + odd);
				break;
			}
			if(input %2 ==0) {
				even++;
			}else {
				odd++;
			}
			sum += input;
		}
		
//		do {
//			System.out.print("숫자입력 : ");
//			int input = sc.nextInt();
//			if(input == -1) {
//				System.out.println("누적결과 : " + sum);
//				break;
//			}
//			sum += input;
//		} while (true);
		


	}

}
