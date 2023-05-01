package model;

public class Warrior extends Character implements Defensible{
	private SwordVO equippedItem;
	

	public Warrior(int hp, int op, int dp) {
		super(hp, op, dp);
	}

	@Override
	public void defence() {
		System.out.println("워리어 방어!");
	}

	@Override
	public void attack() {
		System.out.println("워리어 공격!");
	}

	@Override
	public void printInfo() {
		System.out.printf("Hp : %d Op : %d Dp : %d",getHp(),getOp(),getDp());
		
	}

	@Override
	public void ItemUse(ItemVO item) {
		System.out.println("전사 아이템 사용");
		if(item instanceof SwordVO) {
			this.equippedItem = (SwordVO) item;
		}
	}

	@Override
	public void ItemUnUse() {
		System.out.println("전사 아이템 해제");
	}

}
