package model;

public class Archer extends Character{
	private BowVO equippedItem;

	public Archer(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("아처 활공격!");
	}

	@Override
	public void printInfo() {
		System.out.printf("Hp : %d Op : %d Dp : %d",getHp(),getOp(),getDp());
		
	}

	@Override
	public void ItemUse(ItemVO item) {
		System.out.println("아처 아이템 사용");
		// A instanceof B => A객체가 B클래스에 속하면 true, 아니면 false.
		if(item instanceof BowVO) {
			this.equippedItem = (BowVO) item;
		}
		
	}

	@Override
	public void ItemUnUse() {
		System.out.println("아처 아이템 해제");
	}

}
