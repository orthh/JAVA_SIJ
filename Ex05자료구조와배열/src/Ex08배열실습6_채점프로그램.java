import java.util.Scanner;

public class Ex08배열실습6_채점프로그램 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		int[] answer = {1, 4, 3, 2, 1};
		
		int[] uAnswer = new int[answer.length];
		
		int sum = 0;
		String check = "";
		int cnt = 0;
		while(true) {
			System.out.print(cnt + 1 + "번답 >> ");
			uAnswer[cnt] = sc.nextInt();
			if(answer[cnt] == uAnswer[cnt]) {
				check += "O   ";
				sum += 20;
			}else {
				check += "X   ";
			}
			cnt++;
			if(cnt >= answer.length) break;
		}
		

		System.out.println("정답 확인 " + check);
		
		System.out.print("총점 : " + sum);

	}

}
