package last;

import java.util.Scanner;

public class Q2_HoursPay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요");
		int hours = sc.nextInt();

		int pay = hours * 5000;
		if(hours > 8) {
			pay += (hours -8) * 5000* 0.5;
		}
		System.out.println(pay);
	}

}
