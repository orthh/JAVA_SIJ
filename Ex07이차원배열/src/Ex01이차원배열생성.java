import java.util.Arrays;

public class Ex01이차원배열생성 {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][5] ; //배열생성시 크기 무조건 지정
		//일차원배열 3개 -> 5칸(길이5)
		//레퍼런스배열 1개 -> 길이 3
		// -> 3행 5열 행렬 구조
		//int형 배열 -> 초기화를 하지 않으면 기본 0
		
		arr[0][0] = 10;
		
//		arr[0] = 1; -> 레퍼런스 배열 초기화는 불가능
		
		System.out.println(arr[0][0]);
		
		
		char[][] charArr = {{'a','b','c'},{'d','e','f'}};
		System.out.println(charArr.length); //2 -> 레퍼런스 배열의 길이
											       // 1차원 배열이 몇개 ? 
		System.out.println(charArr[0].length); //3 -> 1차원 배열의 길이 ? 3
		
		
		int[][] arr2 = new int[5][5];
		
		int num = 1;
		for(int i = 0 ; i<arr2.length; i++) { //반복
			for(int j=0; j<arr2[i].length; j++) { //1차원 배열 하나 만듬
				arr2[i][j] = num++;
			}
		}
		
		for(int i = 0 ; i<arr2.length; i++) { //반복
			for(int j=0; j<arr2[i].length; j++) { //1차원 배열 하나 만듬
				System.out.printf("%3d",arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------------------구분선-----------------------");
		
		//21부터
		int num3 = 21;
		int[][] arr3 = new int [4][6];
		
		for(int i = 0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				arr3[i][j] = num3++;
			}
		}
		
		for(int i = 0 ; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.printf("%3d",arr3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("---------------------구분선-----------------------");
		//1.num초기화후 풀이
		int num4 = 1;
		int[][] arr4 = new int[5][5];

		for(int i=0; i<arr4.length; i++) {
			for(int j=arr4[i].length - 1; j>=0; j--) {
				arr4[i][j] = num4 ++;
			}
		}
		
		for(int i = 0 ; i<arr4.length; i++) {
			for(int j=0; j<arr4[i].length; j++) {
				System.out.printf("%3d",arr4[i][j]);
			}
			System.out.println();
		}
		

		
	}

}
