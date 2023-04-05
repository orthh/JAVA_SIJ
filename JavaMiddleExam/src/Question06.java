import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		String str = sc.nextLine();
		
		//1.기본
		
		int num = Integer.parseInt(str);
		
		int result = 0;
		for(int i=1; i <= 4; i++) {
			int remain = num % 10;
			result += remain;
			num /= 10;
		}
		
		System.out.println("각 자리수 합 : " + result);
		
		
		//2.내장함수
		
//		int resultA = 0;
//		
//		for(int i=0; i<=str.length() - 1; i++) {
//			String a = str.charAt(i) + "" ;
//			resultA += Integer.parseInt(a);
//		}
//		
//		System.out.println("각 자리수 합 : " + resultA);

	}

}
