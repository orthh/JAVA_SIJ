import java.util.Random;
import java.util.Scanner;

public class Ex05PlusGame {

	public static void main(String[] args) {
		//랜덤 기능 사용하기
		Random rd = new Random();
		//스캐너 기능 사용
		Scanner sc = new Scanner(System.in);
//		int num = rd.nextInt(10); //0~9 랜덤한 숫자
//		System.out.println(num);
//		
//		//1부터 10까지 랜덤한 숫자
//		System.out.println(rd.nextInt(10) + 1);
//		

		System.out.println("===Plus Game===");


		int life = 3;
		boolean isValid = true;
		while(true) {
			boolean test = false;
			String yesOrNo;
			if(isValid == false) {
				while(true) {
					System.out.print("Y 나 N 을 입력해주세요 >>");
					yesOrNo = sc.next();
					if(yesOrNo.equals("Y") || yesOrNo.equals("N")) {
						if(yesOrNo.equals("Y")) life --;
						if(yesOrNo.equals("N")) {
							test = true;
						}
						isValid = true;
						break;
					}
				}
			}
			if(test) break;
			int num1 = rd.nextInt(50) + 1;
			int num2 = rd.nextInt(50) + 1;
			System.out.print(num1 + " + " + num2 + " = ");
			int answer = sc.nextInt();
			
			if(answer != num1 + num2) {
				System.out.print("Fail\n계속 하시겠습니까? ");
				yesOrNo = sc.next();
				if(yesOrNo.equals("Y") || yesOrNo.equals("N")) {
					if(yesOrNo.equals("N") || life <=1) {
						break;
					}else if(yesOrNo.equals("Y")) {
						life--;
						System.out.println("남은 목숨 : " + life);
					}
				}else {
					isValid = false;
				}
				
			}else {
				System.out.println("Success");
			}
		}
		System.out.println("종료합니다.");
		

//		if(input == num1 + num2) {
//			System.out.println("Success");
//		}else {
//			System.out.println("Fail");
//		}
	}

}
