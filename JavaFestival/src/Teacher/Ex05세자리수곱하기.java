package Teacher;

import java.util.Scanner;

public class Ex05세자리수곱하기 {

	public static void main(String[] args) {
		//입력하는 도구 가져오기
		Scanner sc = new Scanner(System.in);
		//출력문 : 입력(1)
		System.out.print("첫 번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		//출력문 : 입력(2)
		System.out.print("두 번째 정수 입력 >> ");
		int num2 = sc.nextInt();
		//(1) * (2)
		//출력문 1
		//(1) * (2)의 일의자리 숫자
		int out1 = num1 * (num2%100%10);
		System.out.println(out1);
		//출력문 2
		//(1) * (2)의 십의자리 숫자
		int out2 = num1 * (num2%100/10);
		System.out.println(out2);
		//출력문 3
		//(1) * (2)의 백의자리 숫자
		int out3 = num1 * (num2/100);
		System.out.println(out3);
		//마지막 결과값
		//(1) * (2)
		System.out.println(num1 * num2);
		
		
	}

}
