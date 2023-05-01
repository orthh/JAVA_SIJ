package model;

public abstract class Creature {
	private int hp;
	private int op;
	private int dp;
	
	
	
	public Creature(int hp, int op, int dp) {
		this.hp = hp;
		this.op = op;
		this.dp = dp;
	}
	
	
	public abstract void attack();
	public abstract void printInfo();
	
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op;
	}
	public int getDp() {
		return dp;
	}
	public void setDp(int dp) {
		this.dp = dp;
	}
	
	
}
