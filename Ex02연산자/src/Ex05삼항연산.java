import java.util.Scanner;

public class Ex05삼항연산 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		System.out.println(num % 2 ==0 ? "짝수입니다." : "홀수입니다.");
		System.out.println(num + ((num % 2) ==0 ? "짝수입니다." : "홀수입니다."));
		
		String s = num % 2 ==0 ? "짝수입니다." : "홀수입니다." ;
		System.out.println(s);
		
		
		
	}
	

}


