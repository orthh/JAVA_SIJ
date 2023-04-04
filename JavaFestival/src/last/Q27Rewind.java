package last;

import java.util.Scanner;

public class Q27Rewind {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		
		String[] str = sc.next().split("");
	
		int sum = 0;
		int acc= 0;
		for(String item: str) {
			if(item.equals("O")) {
				sum += ++acc;
			}else {
				acc = 0;
			}
		}
		System.out.println(sum);
	}

}
