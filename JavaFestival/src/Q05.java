import java.util.Scanner;

public class Q05 {


		public static void main(String[] args) {
		
			// 행 개수를 입력 받아 다음과 같이 삼각형을 출력하시오.
		
			Scanner sc = new Scanner(System.in);
		
			System.out.print("행 개수 : ");
			int num = sc.nextInt();
		
			int cnt = 1;
			while(cnt <= num) {
		
		
		//			for(int i=1; i<=cnt; i++) {
		//				System.out.print("*");
		//			}
			int numStar = 1;
			while(numStar <= cnt) {
			System.out.print("*");
			numStar ++ ;
			}
			System.out.print("\n");
			cnt++;
			}
		}

}