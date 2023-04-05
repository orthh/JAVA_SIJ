package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {
		// 두 인접한 요소를 비교하여 정렬
		//int[] arr = { 10, 24, 7, 68, 42, 82, 3, 43 };
		int[] arr = {1,2,3,4,6,5,7};

		System.out.println("정렬 전 : " + Arrays.toString(arr));

		int temp; // 치환을 위한 임시 공간
//		// 1회차
//		// 0-1 / 1-2 / 2-3 / 3-4 / 4-5 / 5-6 / 6-7 비교
//		for (int j = 0; j < arr.length - 1; j++) {
//			if (arr[j] > arr[j + 1]) { // 앞의 값이 뒤에값보다 더 크면 스왑
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//		System.out.println(1 + "회차 : " + Arrays.toString(arr)); // 82가 맨끝으로감
//
//		// 2회차
//		// 0-1 / 1-2 / 2-3 / 3-4 / 4-5 / 5-6 비교
//		for (int j = 0; j < arr.length - 2; j++) {
//			if (arr[j] > arr[j + 1]) { // 앞의 값이 뒤에값보다 더 크면 스왑
//				temp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = temp;
//			}
//		}
//		System.out.println(2 + "회차 : " + Arrays.toString(arr)); // 68이 맨끝으로감
//
//		System.out.println("-------------구분선--------------");
		// 메인 알고리즘
		boolean isEnd;
		for (int i = 0; i < arr.length - 1; i++) {
			isEnd = true;
			for (int j = 0; j < arr.length - (i + 1); j++) {
				if (arr[j] > arr[j + 1]) { // 앞의 값이 뒤에값보다 더 크면 스왑
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					isEnd = false; // 한번이라도 바뀌면 끝나지 않음.
				}

			}
			if (isEnd) { // 한번도 바뀌지 않았을때 : 끝 -> break
				break;
			}

			System.out.println(i + 1 + "회차 : " + Arrays.toString(arr)); //
		}

	}

}
