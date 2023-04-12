package 월급계산프로그램;

public class PartTimeEmployee extends Employee{

	int workDay;
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
		this.workDay = workDay;
	}
	
	@Override
	public int getMoneyPay() {
		return pay * workDay;
	}

}
