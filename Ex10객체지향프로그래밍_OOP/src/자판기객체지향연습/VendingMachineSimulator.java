package 자판기객체지향연습;

import java.util.Scanner;

public class VendingMachineSimulator {
	  // 프로그램 돌려주는 객체
	public static void main(String[] args) {

		// 자판기 프로그램을 만들어보자.
		// 객체 지향 연습
		
		// 실행 코드
		// 인스턴스 생성
//		VendingMachine vm;  //변수 선언 (자료형, 변수)
		VendingMachine vm = new VendingMachine();
		VendingMachine vm2 = new VendingMachine();
		VendingMachine vm3 = new VendingMachine();
		
		// 돈 입력받음.
		vm.inputMoney();
		
		// 메뉴 선택
		vm.menuChoice();
		
		//잔돈 계산
		vm.chaneMoney();
		
		
		
		
		
		
		
		
		
		
		//기존코드
//		  Scanner sc = new Scanner(System.in);
//		  System.out.println("====자판기 프로그램====");
//		  System.out.print("돈을 입력하세요 >>");
//		  int money = sc.nextInt();
//		  
//		  System.out.println("1.콜라(500) 2.물(800) 3.비타민워터(1500)");
//		  System.out.print("메뉴를 선택하세요 >>");
//		  int choice = sc.nextInt();
		  
//		  if(choice == 1) money-=500;
//		  else if(choice == 2) money-=800;
//		  else if(choice == 3) money-=1500;
//		  
//		  if(money<0) { // 돈이 부족
//		     System.out.println("잔돈이 부족합니다 ㅠㅠ");
//		  }else { // 잔돈 계산
//		     int won1000 = money/1000; // 천원
//		     int won500 = money%1000/500; // 오백원
//		     int won100 = money%1000%500/100; // 백원
//		     System.out.println("천원 : "+won1000+"개, 오백원 : "+won500+"개, 백원 : "+won100+"개");
//		  }
      
	}

}
