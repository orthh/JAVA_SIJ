import java.util.Random;

public class Ex03배열실습 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		//1. 크기가 10인 1차원 정수형 배열 선언하고 원하는 값 초기화.
		int[] arr = {5,6,13,27,34,35,78,2,3,1};
		
		
		//2.배열의 값 중 홀수만 출력하고 몇개인지 출력하시오.

		System.out.print("배열 홀수 : ");
		int cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
				cnt++;
			}
		}
		System.out.println("\n총 개수 : " + cnt + "개");
		
		//배열을 랜덤값으로 초기화하도록 수정하시오

		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(100) + 1;
		}
			
		System.out.print("배열 홀수 : ");
		cnt = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				System.out.print(arr[i] + " ");
				cnt++;
			}
		}	
		System.out.println("\n총 개수 : " + cnt + "개");
		
	}

}
