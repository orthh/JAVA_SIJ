package last;

import java.util.Scanner;

public class Q28_2to10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2진수를 입력하세요. >> ");
		String str = sc.next();
		
		String[] arr = str.split("");
		int result = 0;
		for(int i = arr.length - 1; i>=0; i--) {
			if(arr[i].equals("1")) {
				result += pow(2, arr.length -1 - i);
			}
		}
		System.out.printf("%s(2) = %d(10)",str,result);

	}
	public static int pow(int a, int b) {
		//a의 b승
		int result = 1;
		for(int i=1; i<=b; i++) {
			result *= a;
		}
		return result;
	}

}
