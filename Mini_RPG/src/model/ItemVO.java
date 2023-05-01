package model;

public abstract class ItemVO {
	private int itemNum;
	private String name;
	private int attackPower;
	
	public ItemVO(int itemNum, String name, int attackPower) {
		this.itemNum = itemNum;
		this.name = name;
		this.attackPower = attackPower;
	}

	public int getItemNum() {
		return itemNum;
	}

	public void setItemNum(int itemNum) {
		this.itemNum = itemNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}
	
	
}

