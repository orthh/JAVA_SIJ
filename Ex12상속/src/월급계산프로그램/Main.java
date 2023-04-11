package 월급계산프로그램;

public class Main {

	public static void main(String[] args) {
		
		RegularEmployee r1 = new RegularEmployee("SMHRD001", "홍길동", 4000, 400);
		
		System.out.println(r1.print());
		System.out.println(r1.getMoneyPay() + "만원");

		
		TempEmployee t1 = new TempEmployee("SMHRD002", "박문수", 4000);
		System.out.println(t1.print());
		System.out.println(t1.getMoneyPay() + "만원");
		
		PartTimeEmployee p1 = new PartTimeEmployee("SMHRD003", "임성훈", 10, 10);
		System.out.println(p1.print());
		System.out.println(p1.getMoneyPay() + "만원");
	}

}
