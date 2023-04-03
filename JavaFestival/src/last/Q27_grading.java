package last;

import java.util.Scanner;

public class Q27_grading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");
		
		String uAnswer = sc.next();
		
		String[] eachAnsw = uAnswer.split("");
		
		int cnt = 0;
		int acc = 0;
		int sum = 0;
		
		while(true) {
			if(eachAnsw[cnt].equals("o")) {
				acc++;
				sum += acc;
			}else {
				acc = 0;
			}
			cnt++;
			if(cnt >= eachAnsw.length) {
				break;
			}
		}
		
		System.out.println(sum);
	}

}
