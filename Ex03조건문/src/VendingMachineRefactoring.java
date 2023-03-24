import java.util.Scanner;

public class VendingMachineRefactoring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		
		  int cola = 1800 ;
	      int aid = 2000 ;
	      int soda = 1200 ; 
	      

	      System.out.print("넣을 금액 : ");
	      int paid = sc.nextInt();
	      System.out.println("--메뉴--");
	      //System.out.print("1.콜라"+cola+"원" "2.파워에이드"+aid+"원" "3.탄산수"+soda+"원"">>");
	      System.out.print("1. 콜라(" + cola + "원)");
	      System.out.print("2. 파워에이드(" + aid + "원)");
	      System.out.print("3. 탄산수(" + soda + "원)");
	      System.out.print("메뉴 번호를 입력하세요: ");
	      int menuNum = sc.nextInt();
	      
	      int menuPrice = 0;

	      
	      switch (menuNum) {
	          case 1:
	              menuPrice = cola;
	              break;
	          case 2:
	              menuPrice = aid;
	              break;
	          case 3:
	              menuPrice = soda;
	              break;
	          default:
	              System.out.println("잘못된 메뉴 번호입니다.");
	      }
	      
	      if (paid < menuPrice) {
	         System.out.println("돈이 부족해요ㅠㅠ");
	      }else {
	         int change = paid - menuPrice;
	         System.out.println("잔돈 : " + change + "원");
	         
	         int chun = change / 1000;
	         if (chun > 0) {
	            System.out.println("천원짜리"+chun+"개");
	            change = change % 1000;
	         }
	         int ohb = change / 500 ;
	         if (ohb > 0) {
	            System.out.println("오백원짜리"+ohb+"개");
	            change = change % 500;
	         }
	         int bag = change / 100 ;
	         if (bag >0) {
	            System.out.println("백원짜리"+bag+"개");
	         }
	      }
	}

}
