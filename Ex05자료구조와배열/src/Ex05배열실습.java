import java.util.Arrays;
import java.util.Random;

public class Ex05배열실습 {

	public static void main(String[] args) {
		Random rd = new Random();
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			max = max < arr[i] ? arr[i] : max;
			min = min < arr[i] ? min : arr[i];
		} 
		System.out.println(Arrays.toString(arr));
		System.out.println("가장 큰 값 : " +  max);
		System.out.println("가장 작은 값 : " + min);
		
	}

}
