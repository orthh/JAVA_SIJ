package last;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Q20_10to2_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int [10];
		
		System.out.println("숫자 입력 >> ");
		int num = sc.nextInt();
		
		int i = 0;
		while(num >= 2) {
			//num을 2로 나눠서 나온 나머지 값을 배열에 저장
			arr[i] = num%2;
			//num을 2로 나누기
			num /= 2;
			//index
			i++;
		}
		arr[i] = num;
		
		//출력 : 
		//0부터 i 까지 값이 들어가있는상태.
		for(int j = i; j>=0; j--) {
			System.out.print(arr[j] + " ");
		}

	}

}
