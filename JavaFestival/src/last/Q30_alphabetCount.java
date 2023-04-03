package last;

import java.util.Arrays;
import java.util.Scanner;

public class Q30_alphabetCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");

		System.out.print("입력 >> ");
		String input = sc.nextLine().replace(" ", "").toLowerCase();

		char s = 'a'; // 97
		char e = 'z'; // 122

		// abc배열
		int[] alphabets = new int[e - s + 1];

		// 만든 배열에 추가
		for (int i = 0; i < input.length(); i++) {
			alphabets[input.charAt(i) - s]++; // char 타입 리턴 -> int, 97~122
			// int로 자동형변환
		}
		// 출력
		for (int i = 0; i < alphabets.length; i++) {
			System.out.print((char) (i + s));
			System.out.println(" : " + alphabets[i]);
		}
	}

}
