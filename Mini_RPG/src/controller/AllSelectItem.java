package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.BowVO;
import model.DAO;
import model.ItemVO;

public class AllSelectItem {
	public void rangeAll(int select) throws SQLException {
		if(select == 1) {
			AllWeapon();
		}else if(select == 2) {
			allSword();
		}else if(select == 3) {
			allBow();
		}else {
			System.out.println("잘못된 선택입니다.");
		}
	}
	
	public void AllWeapon() throws SQLException {
		DAO dao = new DAO();
		ArrayList<ItemVO> bowList = dao.getBowItem();
		ArrayList<ItemVO> swordList = dao.getSwordItem();
		ArrayList<ItemVO> itemList = new ArrayList<>();
		
		itemList.addAll(bowList);
		itemList.addAll(swordList);
		
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("------------------------------");
		for(ItemVO item: itemList) {
			System.out.print(item.getItemNum()+"\t");
			System.out.print(item.getName()+"\t");
			System.out.print(item.getAttackPower()+"\t");
			// sword는 durability가 없음
//			if(item instanceof BowVO) {
//				System.out.println(((BowVO)item).getDurability());
//			}
			try {
				System.out.println(((BowVO)item).getDurability());
			} catch (Exception classCastException) {
				
			}
			System.out.println();
		}
		
		
		
	}
	
	public void allSword() throws SQLException {
		DAO dao = new DAO();
		ArrayList<ItemVO> Sword_db = dao.getSwordItem();
		System.out.println("num\tname\tpower");
		System.out.println("-----------------");
		for(ItemVO SwordObject:Sword_db) {
			System.out.print(SwordObject.getItemNum()+"\t");
			System.out.print(SwordObject.getName()+"\t");
			System.out.println(SwordObject.getAttackPower()+"\t");
		}
		
	}
	
	public void allBow() throws SQLException{
		DAO dao = new DAO();
		ArrayList<ItemVO> Bow_db = dao.getBowItem();
		System.out.println("num\tname\tpower\tdurability");
		System.out.println("------------------------------");
		for(ItemVO BowObject:Bow_db) {
			System.out.print(BowObject.getItemNum()+"\t");
			System.out.print(BowObject.getName()+"\t");
			System.out.print(BowObject.getAttackPower()+"\t");
			System.out.println(((BowVO)BowObject).getDurability());
		}
	}
}
