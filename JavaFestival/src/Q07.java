import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {

		//행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		//행 for문
		for(int i = 0; i<num; i++) {
			//* 개수
			for(int j = num - i; j >=1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		//refactoring
		while(num != 0) {
			System.out.println("*".repeat(num));
			num--;
		}
		
		//
		for(int i=1 ; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}	
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
