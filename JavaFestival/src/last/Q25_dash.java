package last;

import java.util.Scanner;

public class Q25_dash {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요 >> ");
		String num = sc.next();
		

		
		
		int sum = 0;
		
		String[] strArr = num.split("");
		
		for(String item: strArr) {
			sum += dashCount(item);
		}
		System.out.println("대시('-')의 총 합 >> " + sum);
		
		//1.
		int numToDash[] = {6,2,5,5,4,5,6,3,7,6};
		int sum2 = 0;
		int numItem;
		for(String item : strArr) {
			numItem = Integer.parseInt(item);
			sum2 += numToDash[numItem]; 
		}
		
		System.out.println("대시('-')의 총 합2 >> " + sum2);
	}
	


	//2.
	public static int dashCount(String num) {
		int answer = 0;
		switch (num) {
		case "0":
			answer =  6;
			break;
		case "1":
			answer =  2;
			break;
		case "2":
			answer =  5;
			break;
		case "3":
			answer =  5;
			break;
		case "4":
			answer =  4;
			break;
		case "5":
			answer =  5;
			break;
		case "6":
			answer =  6;
			break;
		case "7":
			answer =  3;
			break;
		case "8":
			answer =  7;
			break;
		case "9":
			answer =  6;
			break;
		//no default
		}
		
		return answer;
		
		
		
	}

}
