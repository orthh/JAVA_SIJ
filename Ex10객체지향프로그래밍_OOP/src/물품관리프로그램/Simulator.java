package 물품관리프로그램;

import java.util.Scanner;

public class Simulator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ProductSystem ps = new ProductSystem();
		
		int mode;
		String name;
		int unitPrice;
		int amount;
		String saleList;
		int estimatedPrice;
		while(true) {
			
			do {
				System.out.print("[1]물건 추가 [2]예상 판매량 조회 [3]종료 >> ");
				mode = sc.nextInt();
			} while (mode<=0 || mode>=4);
			
			if(mode == 3) {
				System.out.println("종료합니다.");
				break;
			}else if(mode == 1) {
				// 물건 추가
				sc.nextLine(); //캐시 제거
				System.out.print("물건 이름 : ");
				name = sc.nextLine();
				System.out.print("단가 : ");
				unitPrice = sc.nextInt();
				System.out.print("수량 : ");
				amount = sc.nextInt();
				ps.addPs(new Product(name,unitPrice, amount));
			}else if(mode == 2) {
				// 예상 판매량 조회
				saleList = ps.getSaleList();
				estimatedPrice = ps.getEstimatedPrice();
				System.out.println(saleList);
				System.out.println("판매 시 매출 : " + estimatedPrice + "원 \n");
				
			}
		}

	}

}
