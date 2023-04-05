package timeattack;

import java.util.Scanner;

public class Q25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String[] input = sc.nextLine().split("");
		
		
		int sum = 0;
		for(String item : input) {
			sum+= dashCount(item);
		}
		System.out.println("대시('-')의 총 합 >> " + sum);
	}
	public static int dashCount(String str) {
		int result = 0;
		switch (str) {
		case "0": case "6" : case "9" : 
			result = 6;
			break;
		case "1":
			result = 2;
			break;
		case "2": case "3" :case "5" :
			result = 5;
			break;
		case "4":
			result = 4;
			break;
		case "7":
			result = 3;
			break;
		case "8":
			result = 7;
			break;

		default:
			break;
		}
		
		return result;
	}

}
