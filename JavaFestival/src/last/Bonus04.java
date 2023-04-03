package last;

import java.util.Scanner;

public class Bonus04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] inputValue = new int[5];
		
		int cnt = 0;
		while(true) {
			System.out.print(cnt + "번째 별의 수 : ");
			inputValue[cnt] = sc.nextInt();
			cnt++;
			if(cnt >= 5) {
				break;
			}
		}
		
		for(int item : inputValue) {
			System.out.print(item + ":");
			for(int i=0; i<item; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
