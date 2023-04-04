package last;

import java.util.Scanner;

public class Q28Rewind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		String[] arr = str.split("");
		
		int result = 0;
		for(int i=arr.length-1; i>=0; i--) {
			if(arr[i].equals("1")) {
				result += pow(2, arr.length -1 - i);
			}
		}
		System.out.println(result);
		
		

	}
	public static int pow(int base,int n) {
		int result = 1;
		for(int i=0; i<n;i++) {
			result *= base;
		}
		return result;
	}

}
