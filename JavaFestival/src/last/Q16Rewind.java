package last;

import java.util.Scanner;

public class Q16Rewind {

	public static void main(String[] args) {
		//1.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		String[] arr = String.valueOf(num).split(""); 
		
		int sum = 0;
		for(String item : arr) {
			sum += Integer.parseInt(item);
		}
		System.out.println("합은 " + sum + "입니다");
		
		//2.
		int sum2 = 0;
		int cnt = 0;
		while(true) {
			sum2 += num % 10;
			num /= 10;
			cnt++;
			if(cnt >= 8) {
				break;
			}
		}
		System.out.println(sum2);

	}

}
