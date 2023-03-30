import java.util.Arrays;
import java.util.Scanner;

public class Ex06_실습4과제 {

	public static void main(String[] args) {
		//입력한 점수 중 최고 점수와 최저 점수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		int cnt = 0;
		while(true) {
			System.out.print(cnt + 1 +"번째 입력 >> ");
			arr[cnt] = sc.nextInt();
			cnt++;
			if(cnt>4) break;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int item : arr) {
			max = max < item ? item : max;
			min = min < item ? min : item;
		}
		
		System.out.println("입력된 점수 : " 
				+ Arrays.toString(arr)
				.replace("[", "")
				.replace("]","")
				.replace(",", ""));
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
	}

}
