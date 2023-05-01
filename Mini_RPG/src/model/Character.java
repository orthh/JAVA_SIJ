package model;

public abstract class Character extends Creature{
	
	
	public Character(int hp, int op, int dp) {
		super(hp, op, dp);
	}
	public abstract void ItemUse(ItemVO item);
	public abstract void ItemUnUse();
	
	
}
