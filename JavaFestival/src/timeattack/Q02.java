package timeattack;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간을 입력하세요 : ");
		int hours = sc.nextInt();
		
		int result = hours * 5000;
		if(result > 8) {
			result += (hours - 8) * 2500;
		}
		
		System.out.println("총 임근은 " + result + "입니다.");
	}

}
