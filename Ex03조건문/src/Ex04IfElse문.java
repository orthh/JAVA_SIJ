import java.util.Scanner;

public class Ex04IfElse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("총 금액 : ");
		int totalAmount = sc.nextInt();
		
		System.out.print("사람 명 수 : ");
		int people = sc.nextInt();
		
		if(totalAmount / people >= 10000) {
			System.out.println("10000원 이상 지불");
		}else {
			System.out.println("10000원 미만 지불");
		}
		
		
	}

}
