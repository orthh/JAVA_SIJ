package timeattack;

import java.util.Scanner;

public class Q27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		
		String[] arr = sc.nextLine().split("");
		
		int acc = 0;
		int sum = 0;
		for(String item : arr){
			if(item.equals("O")) {
				sum += ++acc;
			}else {
				acc = 0;
			}
		}
		
		System.out.println(sum);
		

	}

}
