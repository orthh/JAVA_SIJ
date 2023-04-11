package 월급계산프로그램;

public class RegularEmployee {
	
	String empno;
	String name;
	int pay;
	int bonus;
	
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.bonus = bonus;
	}
	
	public int getMoneyPay() {
		return (pay + bonus) / 12 ;
	}
	
	public String print() {
		return empno + " : " + name + " : " + pay; 
	}
}
