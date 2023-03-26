import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("일한시간을 입력하세요 : ");
		int workHours = sc.nextInt();

		int payPerHour = 5000;
		int overTimeStandard = 8;
		double overTimePay = 1.5;
		int exceedHour = workHours - overTimeStandard;
		double exceedPrice = exceedHour * payPerHour * (overTimePay);

		double totalPay = 0;

		if(exceedHour >= 1) {
			totalPay = payPerHour * overTimeStandard
						+ exceedPrice ;
		}else {
			totalPay = payPerHour * workHours;
		}

		System.out.printf("총 임금은 %.0f원 입니다." , totalPay);

	}

}
