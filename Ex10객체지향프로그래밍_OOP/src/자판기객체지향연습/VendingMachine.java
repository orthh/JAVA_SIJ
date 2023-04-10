package 자판기객체지향연습;

import java.util.Scanner;

//자판기 객체
public class VendingMachine {
	Scanner sc = new Scanner(System.in);
	//필드
	int choice, money;
	
	//돈을 입력받는 메서드
	public void inputMoney() {
		System.out.println("====자판기 프로그램====");
		System.out.print("돈을 입력하세요 >>");
		money = sc.nextInt();
	}
	
	//메뉴 선택하는 메서드
	public void menuChoice() {
		System.out.println("1.콜라(500) 2.물(800) 3.비타민워터(1500)");
		System.out.print("메뉴를 선택하세요 >>");
		choice = sc.nextInt();
	}
	
	//잔돈 계산 메서드
	public void chaneMoney() {
		 if(choice == 1) money-=500;
		   else if(choice == 2) money-=800;
		   else if(choice == 3) money-=1500;
		  
		  if(money<0) { // 돈이 부족
		     System.out.println("잔돈이 부족합니다 ㅠㅠ");
		  }else { // 잔돈 계산
		     int won1000 = money/1000; // 천원
		     int won500 = money%1000/500; // 오백원
		     int won100 = money%1000%500/100; // 백원
		     System.out.println("천원 : "+won1000+"개, 오백원 : "+won500+"개, 백원 : "+won100+"개");
		  }
	}
	
	
	
	
	
	
}
