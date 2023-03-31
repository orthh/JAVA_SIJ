import java.util.Arrays;
import java.util.Scanner;

public class Ex06_실습4과제 {

	public static void main(String[] args) {
		//입력한 점수 중 최고 점수와 최저 점수를 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		//refactoring : 몇번 입력하든 다 적용.
		
		
		String tempStr = "";

		//int[] arr = new int[5];
		
		int cnt = 0;
		System.out.println("종료하려면 -1을 입력하세요.");
		while(true) {
			System.out.print(cnt + 1 +"번째 입력 >> ");
			//arr[cnt] = sc.nextInt();
			int input = sc.nextInt();
			if(input == -1) break;
			if(cnt == 0) {
				tempStr +=  input;
			}else {
				tempStr += "," + input;
			}
			cnt++;
		}
		
		String[] inputArr = tempStr.split(",");
		//String 아이템 >> int 배열
		int[] arr = new int[inputArr.length];
		
		for (int i = 0; i < inputArr.length; i++) {
			arr[i] = Integer.parseInt(inputArr[i]);
		}
		

		int max = arr[0];
		int min = arr[0];
		int sum = 0;
		for(int item : arr) {
			//삼항연산자 사용? x? 
//			max = max < item ? item : max;
//			min = min < item ? min : item;
			sum += item;
			if(max < item) {
				max = item;
			}
			if(min > item) {
				min = item;
			}
		}

		
		System.out.println("입력된 점수 : " 
				+ Arrays.toString(arr)
				.replace("[", "")
				.replace("]","")
				.replace(",", ""));
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.1f" , (double)sum / arr.length);
	}

}
