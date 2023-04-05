package timeattack;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now  = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int target  = sc.nextInt();

		int week = 1;
		while(true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			now -= minus;
			if( now <= target) {
				System.out.println(now + "kg 달성!! 축하합니다 !!");
				return;
			}
		}
	}

}
