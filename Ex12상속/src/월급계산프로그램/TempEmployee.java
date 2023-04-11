package 월급계산프로그램;

public class TempEmployee {
	String empno;
	String name;
	int pay;
	
	public TempEmployee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}
	
	public int getMoneyPay() {
		return pay / 12 ;
	}
	
	public String print() {
		return empno + " : " + name + " : " + pay; 
	}
	
	
}
