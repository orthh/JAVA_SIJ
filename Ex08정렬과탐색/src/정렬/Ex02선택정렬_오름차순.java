package 정렬;

import java.util.Arrays;

public class Ex02선택정렬_오름차순 {

	public static void main(String[] args) {

		int[] arr = { 98, 7, 70, 13, 24 };

		System.out.println("정렬 전 : " + Arrays.toString(arr));

		int temp; // 치환시 사용
//		//1회차
//		int index = 0;
//		for(int i = index + 1; i<5 ; i++) {
//			if(arr[index] > arr[i]) {
//				index = i;  //배열안에서 가장 작은 값이 존재하는 인덱스 번호
//			}
//		}
//		temp = arr[0]; //교환
//		arr[0] = arr[index]; //가장 작은 숫자 -> 0
//		arr[index] = temp; //원래 0번에 있던 값을 index로 옮기기!
//		
//		System.out.println(1 + "회차 : " + Arrays.toString(arr));
//		
//		//2회차
//		index = 1;
//		for(int i = index + 1; i<5 ; i++) {
//			if(arr[index] > arr[i]) {
//				index = i;  // 두번째로 작은숫자가 존재하는 인덱스 번호
//			}
//		}
//		temp = arr[1]; //교환
//		arr[1] = arr[index]; //가장 작은 숫자 -> 1
//		arr[index] = temp; //원래 1번에 있던 값을 index로 옮기기!
//		
//		System.out.println(2 + "회차 : " + Arrays.toString(arr));
//		

		// 메인알고리즘
		int index; // 내가 지금까지 본 숫자중 가장 작은 수의 인덱스 번호 기억
		for (int i = 0; i < arr.length - 1; i++) { // 배열안 에 숫자 개수 -1 회차
			// 2회차
			index = i; // 1회차 - 0 , 2회차 - 1, 3회차 - 2, 4뢰차 - 3
			for (int j = index + 1; j < arr.length;j++) {
				if (arr[index] > arr[j]) {
					index = j; // 두번째로 작은숫자가 존재하는 인덱스 번호
				}
			}
			temp = arr[i]; // 교환
			arr[i] = arr[index]; // 가장 작은 숫자 -> 1
			arr[index] = temp; // 원래 1번에 있던 값을 index로 옮기기!

			System.out.println(i + 1 + "회차 : " + Arrays.toString(arr));

		}

	}

}
