import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		//입력도구
		Scanner sc = new Scanner(System.in);
		//1. 1-100까지 중 3의 배수를 출력하세요.
		for(int i = 1; i<=100; i ++) {
			if(i % 3 == 0) System.out.print(i + " ");
		}
		System.out.println();
		
		//1-refactoring(성능)
		int numA = 3;
		for(int i=numA; i<=100; i += numA) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//2. 1-100까지 중 3의 배수이면서 5의 배수를 출력하세요
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//2- refactoring(성능)
		int a = 3;
		int b = 5;
		for(int i= a*b; i<100; i+=a*b) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//3.한개의 자연수를 입력받아 그 수의 배수를 차례로 10개
		//출력하는 프로그램을 작성하시오.
		System.out.print("자연수를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.print(num * i + "  ");
		}
	}

}
