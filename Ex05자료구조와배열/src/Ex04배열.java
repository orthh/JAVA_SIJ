import java.util.Arrays;
import java.util.Random;

public class Ex04배열 {

	public static void main(String[] args) {
		
		//1.정수형 데이터 담을 수 있는 배열 array 선언하시오.
		int[] array;
		
		//크기가 10인 배열 생성후 참조값을 변수에 저장
		array = new int[10];

		//3.0~9 인덱스에 값 초기화
		array[0] = 20;
		array[1] = 12;
		array[2] = 13;
		array[3] = 21;
		array[4] = 26;
		array[5] = 33;
		array[6] = 43;
		array[7] = 12;
		array[8] = 8;
		array[9] = 5;

		//4. 모든 데이터 출력
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//배열 그대로 출력(자바스크립트처럼)
		//도구 -> 객체(인스턴스)
		//toString : 객체가 가지고 있는 공통 기능
		// : 객체가 가지고 있는 값을 문자열로 바꿔주는 기능
		System.out.println(Arrays.toString(array));
		//Integer.toString(1);
		
		//5.1번 인덱스에 저장된 값과 4번 인덱스에 저장된 값의 합을 출력
		System.out.println(array[1] + array[4]);
		
		//6. 각 인덱스에 저장된 모든 값을 더하여 출력
		int sum = 0;
		for(int i=0; i<array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		
		//7. 배열안에 있는 수의 평균
		System.out.println((double)sum/array.length);
		
	}

}
