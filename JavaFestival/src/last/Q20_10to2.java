package last;

import java.util.Scanner;

public class Q20_10to2 {

	public static void main(String[] args) {
		// 입력도구 가져오기
		Scanner sc = new Scanner(System.in);
		// 2진수를 저장할 수 있는 배열 : 10
		int[] arr = new int[10];
		// 2진수를 구해서 배열에 저장
		
		// 출력
		
		//ex) 8을 2진수로 바꾸기 
		//8을 2로 나누기 몫:4 , 나머지 : 0;
		//또 2로 나누기 몫:2, 나머지0
		//또 2로 나누기 몫:1 , 나머지 : 0  몫 > 나머지
		to2(10);

	}
	
	public static void to2(int n) {
		int[] result = new int[10];
		
		int cnt = 0;
		while(n != 0) {
			result[cnt++] = n%2;
			n /= 2;
		}
		for(int i=cnt -1 ; i>=0; i--) {
			System.out.print(result[i] + " ");
		}

	}
	
	

}
