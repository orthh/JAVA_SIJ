package timeattack;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수입력 : ");
		int dansu = sc.nextInt();
		
		System.out.println("어느 수까지 출력 : ");
		int max = sc.nextInt();
		
		System.out.println(dansu + "단");
		for(int i=1; i<=max; i++) {
			System.out.println(dansu + "*" + i + "=" + dansu * i);
		}

	}

}
