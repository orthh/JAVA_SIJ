package 월급계산프로그램;

public abstract class Employee {
	
	// 공통적인 필드, 공통 기능
	String empno;
	String name;
	int pay;
	
	//상속 + 추상
	public abstract int getMoneyPay();
	
	public String print() {
		return empno + " : " + name + " : " + pay; 
	};
	
}