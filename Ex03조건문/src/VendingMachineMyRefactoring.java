import java.util.Scanner;

public class VendingMachineMyRefactoring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int coke = 1800;
		int powerAde = 2000;
		int sparkWater = 1200;
		
		System.out.print("넣을 금액 : ");
		int paid = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1.콜라("+ coke + "원)");
		System.out.print("1.파워에이드("+ powerAde + "원)");
		System.out.print("1.콜라("+ sparkWater + "원) >> ");
		
		int selectedMenu = sc.nextInt();
		
		int menuPrice = 0;
		
		switch (selectedMenu) {
		case 1:
			menuPrice = coke;
			break;
		case 2:
			menuPrice = powerAde;
			break;
		case 3:
			menuPrice = sparkWater;
			break;
			//no default
		}
		
		if(paid < menuPrice) {
			System.out.println("돈이부족해요");
		}else {
			int change = paid - menuPrice;
			System.out.println("잔돈 : " + change + "원");
			
			int chun = change / 1000;
			if(chun >=1) {
				System.out.println("천원 : " + chun +"개");
				change %= 1000;
			}
			
			int obw = change / 500;
			if(obw >=1) {
				System.out.println("오백원 : " + obw +"개");
				change %= 500;
			}
			
			int bag = change / 100;
			if(bag >=1) {
				System.out.println("백원 : " + bag +"개");
				change %= 1000;
			}
		}

		
		


	}

}
