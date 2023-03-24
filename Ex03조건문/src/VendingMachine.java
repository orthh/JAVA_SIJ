import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int putCoin = sc.nextInt();
		
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) "
				+ "3.탄산수(1200원) >> ");
		int selectedMenu = sc.nextInt();
		
		int cokePrice = 1800;
		int poweraidePrice = 2000;
		int spkWater = 1200;
		
		int changes = 0;
		
		//잔돈 있을시 트루
		boolean isChanges = false ;
		
		//잔돈 로직
		switch (selectedMenu) {
		case 1:
			if(putCoin >= cokePrice) {
				changes = putCoin - cokePrice ;
				isChanges = true;
			}else {
				System.out.println("돈이 부족해요 ㅠㅡㅜ");
			}
			break;
		case 2:
			if(putCoin >= poweraidePrice) {
				changes = putCoin - poweraidePrice ;
				isChanges = true;
			}else {
				System.out.println("돈이 부족해요 ㅠㅡㅜ");
			}
			break;
		case 3:
			if(putCoin >= cokePrice) {
				changes = putCoin - spkWater ;
				isChanges = true;
			}else {
				System.out.println("돈이 부족해요 ㅠㅡㅜ");
			}
			break;
		   //no default
		}
		
	
		
		
		//잔돈1번
		if(isChanges) {
			System.out.println("잔돈 : " + changes);
			int changes_1000 = 0;
			int changes_500 = 0;
			int changes_100 = 0;
			while (changes != 0) {
				if(changes / 1000 != 0) {
					changes_1000++;
					changes -= 1000;
				}
				if(changes / 500 != 0) {
					changes_500++;
					changes -= 500;
				}
				if(changes / 100 != 0) {
					changes_100++ ;
					changes -= 100;
				}
			}

			System.out.println("천원 : " + changes_1000);
			System.out.println("오백원 : " + changes_500);
			System.out.println("백원 : " + changes_100);
			
		}
		
		
		//잔돈2번
		if(isChanges) {
			System.out.println("잔돈 : " + changes);
			if(changes / 1000 >= 1) {
				System.out.println("천원 : " + changes / 1000);
				changes -= changes / 1000 * 1000 ;
			}
			if(changes / 500 >= 1) {
				System.out.println("오백원 : " + changes / 500);
				changes -= changes / 500 * 500 ;
			}
			if(changes / 100 >= 1) {
				System.out.println("백원 : " + changes / 100);
				changes -= changes / 100 * 100 ;
			}
		}
		
	}

}
