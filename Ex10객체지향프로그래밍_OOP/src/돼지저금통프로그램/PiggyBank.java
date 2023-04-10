package 돼지저금통프로그램;

public class PiggyBank {
	// 필드 - money
	private int money;

	// 메서드 - deposit, withdraw, showMoney
	public PiggyBank() {
		System.out.println("돼지저금통 생성!!");
	}
	public PiggyBank(int money) {
		this.money = money;
		System.out.println("돼지저금통 생성!!");
	}
	
	public void deposit(int inputMoney) {
		money += inputMoney;
	}
	
	public void withdraw(int outputMoney) {

		if( money >= outputMoney) {
			money -= outputMoney;
		}
	}
	
	public int getMoney() {
		return money;
	}
	
	
}
