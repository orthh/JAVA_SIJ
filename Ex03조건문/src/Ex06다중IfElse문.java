import java.util.Scanner;

public class Ex06다중IfElse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수입력 : ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A학점입니다");
		}else if(score >= 80) {
			System.out.println("B학점입니다");
		}else if(score >= 70) {
			System.out.println("C학점입니다");
		}else {
			System.out.println("F학점입니다");
		}

	}

}
