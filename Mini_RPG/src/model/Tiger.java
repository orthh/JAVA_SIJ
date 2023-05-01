package model;

public class Tiger extends Monster{

	public Tiger(int hp, int op, int dp) {
		super(hp, op, dp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("타이거 공격!");
	}

	@Override
	public void printInfo() {
		System.out.printf("Hp : %d Op : %d Dp : %d",getHp(),getOp(),getDp());
		
	}
	
}
