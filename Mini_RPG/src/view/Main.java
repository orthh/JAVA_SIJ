package view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import controller.AllSelectItem;
import model.BowVO;
import model.DAO;
import model.ItemVO;
import model.SwordVO;

public class Main {
	public static void main(String[] args) throws SQLException {
		
		Main_display mdp = new Main_display();
		Scanner sc = new Scanner(System.in);
		AllSelectItem allSelect = new AllSelectItem();
		
		while(true) {
			mdp.render();
			int select = sc.nextInt();
			if(select == 1) {
				// 아이템 조회
				System.out.print("1. 전체아이템 조회 2. 검 아이템 조회 3. 활 아이템 조회 >> ");
				select = sc.nextInt();
				allSelect.rangeAll(select);
			}else if(select == 2) {
				// 캐릭터 생성
			}else if(select == 3) {
				// 장비 장착
			}else {
				// 종료
				System.out.println("종료");
				break;
			}
		}
	

	}
}
