import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//빌드업
		//5개의 구문 반복
		//Y가 눌렸을시 ISCONTINUE = true, ELSE FALSE
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자(+/-) : ");
			String oper = sc.next();
			
			if(oper.equals("+")) {
				System.out.println(num1 + " + " + num2 + " = " 
						+ (num1 + num2));
			}else if(oper.equals("-")) {
				System.out.println(num1 + " - " + num2 + " = " 
						+ (num1 - num2));
			}else {
				System.out.println("잘못된 연산자입니다.");
			}
			System.out.print("계속하시겠습니까?(Y)");
			String ctn = sc.next();
			if(ctn.equals("Y")) {
				//
			}else {
				System.out.println("종료");
				isContinue = false;
			}
		}
	}

}
