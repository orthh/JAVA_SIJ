import java.util.Scanner;

public class Ex08busCard {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액 : ");
		int balance = sc.nextInt();
		
		System.out.print("성인/청소년/어린이 : ");
		String ageType = sc.next();
		
		int adultFee = 1800;
		int teenagerFee = 1500 ;
		int childFee = 1000;
		
		/*if(ageType.equals("성인")) {
			if(balance >= adultFee) {
				System.out.println("감사합니다");
				balance -= adultFee;
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}else if(ageType.equals("청소년")) {
			if(balance >= teenagerFee) {
				System.out.println("반갑습니다");
				balance -= teenagerFee;
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}else {
			if(balance >= childFee) {
				System.out.println("안녕하세요");
				balance -= childFee;
			}else {
				System.out.println("잔액이 부족합니다");
			}
		}*/
		
		//refactoring
		if(ageType.equals("성인") && balance >= adultFee) {
			System.out.println("감사합니다.");
		}else if(ageType.equals("청소년") && balance >= teenagerFee) {
			System.out.println("반갑습니다.");
		}else if(ageType.equals("어린이") && balance >= childFee){
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
		
	}

}
