package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator {

	public static void main(String[] args) {
		System.out.println("===돼지 저금통===");
		// 돼지 저금통 객체 생성
		PiggyBank pb = new PiggyBank();
		// 입금기능 메소드 호출
		Scanner sc = new Scanner(System.in);
		System.out.print("입금할 금액 입력 : ");
		int inputMoney = sc.nextInt();
		pb.deposit(inputMoney);
		// 출금기능 메소드 호출
		System.out.print("출금할 금액 입력 : ");
		int outMoney = sc.nextInt();
		pb.withdraw(outMoney);
		// 잔액확인 메소드 호출
		int balance = pb.getMoney();
		System.out.println(balance + "원 남았습니다.");
		
		//놀이터
		
		
		
	}

}
