package timeattack;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] arr = new int[10];
		
		int cnt = 0;
		
		for(int i=0; i<10; i++) {
			System.out.print(i + 1 + "번째 정수 입력 >> ");
			int num = sc.nextInt();
			if(num % 3 == 0) {
				arr[cnt] = num;
				cnt++;
			}
		}
		
		System.out.print("3의 배수 : ");
		for(int i = 0; i< cnt; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
