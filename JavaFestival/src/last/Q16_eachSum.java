package last;

import java.util.Scanner;

public class Q16_eachSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		//length구하기
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		
		int sum = 0;
		for(int i=0; i<str.length(); i++) {
			sum += num%10;
			num /= 10;
		}
		System.out.println(sum);
		
		

	}

}
