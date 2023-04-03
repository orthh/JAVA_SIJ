package second;

import java.util.Scanner;

public class Q5_mul3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] inputArr = new int[10];
		
		for(int i=0; i<inputArr.length; i++) {
			System.out.print(i + 1 +"번 째 정수 입력>>");
			int input = sc.nextInt();
			
			inputArr[i] = input;
		}
		

		//출력
		System.out.print("3의 배수 : ");
		for(int item : inputArr) {
			if(isMultiple(item,3)) {
				System.out.print(item + " ");
			}
		}
		

	}
	
	public static boolean isMultiple(int base, int n) {
		if( base % n == 0) {
			return true;
		}else {
			return false;
		}
		
		
	}

}
